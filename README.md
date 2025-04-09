Project Overview:

This is a banking application built in Java that supports a command-line interface where users can interact with the system, create accounts, and perform transactions. Clean code practices were followed when creating this program, and code is tested using unit tests to ensure successful interaction and reliability. 


Dependencies:

All dependencies were downloaded directly into the IDE. Maven was used to manage all required dependencies, JUnit 5 was used for testing, and Github Actions was used to automatically run tests.


Project Features:

-Account creation
-Deposit funds
-Withdraw funds
-Display account information


Class descriptions:

Bank Class:
-Manages accounts
-Stores accounts in an array

Account Class:
-Handles account creation
-Has methods to declare information related to each account
-Handles deposits and withdrawls

BankingApp Class:
-Displays a menu where the user can interact with created accounts
-Calls the other classes to handle account creation and perform bank operations 
-Effectively communicates all methods and errors to a user


Tests Used:

Account Creation:
-successful account creation
-duplicate account creation

Deposit:
-updates the account balance correctly after deposit
-depositing a negative or zero amount does not change balance

Withdraw:
-new account created successfully with correct account number and holder name.
-unable to create new account with an existing account number 


Clean Code Guidleines:

-Methods and classes have simple, clear, and descriptive names related to function
-No abbreviations used in place of real words
-Methods are kept to a single task
-Nothing is duplicated
-All code is significant, no code unused
-Naming conventions and code writing consistent throughout the program
-Code is written in a clear, concise, and consistent manner
-Plenty of spacing and commented sections without overcrowding
-Comments kept to a minimum to reduce clutter
-Errors handled in a way which gives the user a clear description of what went wrong

The provided screenshot showcases at least 3 examples of clean code practices. Note the clear but simple comments, the descriptive class and method names, and the error handling.