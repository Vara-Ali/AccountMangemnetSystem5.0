# Accounting System

## Overview

The Accounting System is a Java-based application designed to manage bank accounts, allowing users to create, manage, and perform various operations on their accounts. This system supports both Checking and Savings accounts, with features such as depositing money, withdrawing funds, checking balances, calculating Zakat, and interest. Additionally, it provides options to write account details to a file and read from it, as well as interact with Oracle and MySQL databases.

## Features

- **Account Management**: Create and close accounts with unique account numbers.
- **Deposit and Withdrawal**: Deposit money into accounts and withdraw from Checking and Savings accounts.
- **Balance Check**: Check the total balance in an account.
- **Zakat Calculation**: Calculate Zakat for Savings accounts if the balance is above a certain threshold.
- **Interest Calculation**: Calculate interest for Savings accounts based on a predefined rate.
- **File Operations**: Write account details to a file and read from it.
- **Database Integration**: Store and retrieve account information using Oracle and MySQL databases.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Oracle Database and MySQL Database set up and running.
- Necessary JDBC drivers for Oracle and MySQL.

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/accounting-system.git
   cd accounting-system
   ```

2. **Set Up Database**:
   - Ensure you have Oracle and MySQL databases running.
   - Create a database schema and tables as per the requirements of the application.

3. **Configure Database Connection**:
   - Update the database connection details in the `MySQLHandler` and `OracleHandler` classes with your database credentials.

### Running the Application

1. **Compile the Code**:
   ```bash
   javac AccountingSystem.java
   ```

2. **Run the Application**:
   ```bash
   java AccountingSystem
   ```

## Usage

### Main Menu

Upon running the application, you will be presented with the main menu:

1. **Open/Close Account**: Create a new account or close an existing one.
2. **Login**: Log in to your account to perform further actions.
3. **Write to File**: Write account details to `output.txt`.
4. **Read from File**: Read account details from `output.txt`.
5. **Use Oracle for Database Handling**: Store account details in an Oracle database.
6. **Use MySQL for Database Handling**: Store account details in a MySQL database.
7. **Abort the Program**: Exit the application.

### Account Operations

After logging in, you can perform the following operations:

1. **Deposit Money**: Deposit a specified amount into your account.
2. **Withdraw from Checking Account**: Withdraw money from your Checking account.
3. **Withdraw from Savings Account**: Withdraw money from your Savings account.
4. **Check Balance**: Check the total balance in your account.
5. **Calculate Zakat**: Calculate Zakat for Savings accounts.
6. **Calculate Interest**: Calculate interest for Savings accounts.
7. **Display Deductions**: Display all deductions from the Checking account.

## Custom Exceptions

The application uses custom exceptions to handle invalid account numbers and money amounts:

- **InvalidAccountException**: Thrown when an invalid account number is entered.
- **InvalidMoneyException**: Thrown when an invalid money amount is entered.

## File Operations

The application allows you to write account details to a file (`output.txt`) and read from it. This feature is useful for persisting account information between sessions.

## Database Integration

The application supports integration with Oracle and MySQL databases. You can store and retrieve account information using the provided database handlers.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Contact

For any questions or suggestions, please contact varaali85@gmail.com.
