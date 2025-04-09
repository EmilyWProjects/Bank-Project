//Imports
package test.java.com.banking.app;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


//Test class
public class BankingAppTest {

    //Constructor
    private Bank bank;

    @BeforeEach
    public void setup() {
        bank = new Bank(); 
    }

    //Test account create
    @Test
    public void testCreateAccount() {
        bank.createAccount("123", "John Doe");
        Account account = bank.getAccount("123");
        assertNotNull(account, "Account should be created.");
        assertEquals("123", account.getAccountNumber(), "Account number should match.");
        assertEquals("John Doe", account.getHolderName(), "Account holder name should match.");
    }

    //Test account exists
    @Test
    public void testCreateAccountDuplicate() {

        bank.createAccount("123", "John Doe");
        bank.createAccount("123", "Jane Doe"); 
        Account account = bank.getAccount("123");
        assertNotNull(account, "Account should already exist.");
        assertEquals("John Doe", account.getHolderName(), "Account holder name should remain the same.");

    }

    //Test deposit
    @Test
    public void testDeposit() {
        Account account = new Account("123", "John Doe", 100.0);

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated after deposit.");

        account.deposit(-10.0);
        assertEquals(150.0, account.getBalance(), "Balance should not change for negative deposit.");
    }

    //Test withdraw
    @Test
    public void testWithdraw() {
        Account account = new Account("123", "John Doe", 100.0);

        boolean success = account.withdraw(50.0);
        assertTrue(success, "Withdrawal should succeed.");
        assertEquals(50.0, account.getBalance(), "Balance should be updated after withdrawal.");

        success = account.withdraw(100.0);
        assertFalse(success, "Withdrawal should fail due to insufficient funds.");
        assertEquals(50.0, account.getBalance(), "Balance should remain unchanged after failed withdrawal.");

        success = account.withdraw(-100.0);
        assertFalse(success, "Withdrawal should fail for negative amounts.");
        assertEquals(50.0, account.getBalance(), "Balance should remain unchanged after invalid withdrawal.");
    }

}