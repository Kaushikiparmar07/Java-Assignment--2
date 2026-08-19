import java.io.*;
import java.util.*;

class BankAccount {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int accountNumber;
String accountHolderName;
double balance;

BankAccount() {
    accountNumber = 0;
    accountHolderName = "No Name";
    balance = 0;
}

BankAccount(int accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}

void deposit(double amount) {
    balance = balance + amount;
    System.out.println("Deposit: " + amount);
}

void withdraw(double amount) {
    if (amount > balance) {
        System.out.println("Withdrawal failed! Insufficient balance.");
    }
    else {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }
}

void displayAccount() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Balance: " + balance);
}


public static void main(String[] args) throws IOException {

    BankAccount b1 = new BankAccount();
    BankAccount b2 = new BankAccount(101, "Rahul", 25000);

    System.out.println("----- Account 1 -----");
    b1.displayAccount();

    System.out.println();

    System.out.println("----- Account 2 -----");
    b2.displayAccount();

    System.out.println();

    b2.deposit(5000);
    b2.withdraw(3000);

    System.out.println("Updated Account Details:");
    b2.displayAccount();
}

}