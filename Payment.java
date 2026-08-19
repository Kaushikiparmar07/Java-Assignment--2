import java.io.*;
import java.util.*;

interface Payment {
    void makePayment(double amount);
    void paymentDetails();
}
class CreditCardPayment implements Payment {
    String cardNumber;
    String cardHolderName;
    double amount;
    CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }
    public void paymentDetails() {
        System.out.println("Payment Mode : Credit Card");
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Card Holder Name : " + cardHolderName);
        System.out.println("Amount : Rs. " + amount);
    }
}
class UPIPayment implements Payment {
    String upiId;
    String userName;
    double amount;

    UPIPayment(String upiId, String userName) {
        this.upiId = upiId;
        this.userName = userName;
    }

    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails() {
        System.out.println("Payment Mode : UPI");
        System.out.println("UPI ID : " + upiId);
        System.out.println("User Name : " + userName);
        System.out.println("Amount : Rs. " + amount);
    }
}
class CashPayment implements Payment {
    String customerName;
    double amount;
    CashPayment(String customerName) {
        this.customerName = customerName;
    }
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }
    public void paymentDetails() {
        System.out.println("Payment Mode : Cash");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Amount : Rs. " + amount);
    }
}
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("----- PAYMENT SYSTEM -----");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");

        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(br.readLine());

        Payment p;

        switch(choice) {

            case 1:

                System.out.print("Enter Card Number: ");
                String cardNumber = br.readLine();

                System.out.print("Enter Card Holder Name: ");
                String cardHolderName = br.readLine();

                System.out.print("Enter Amount: ");
                double cardAmount = Double.parseDouble(br.readLine());

                p = new CreditCardPayment(cardNumber, cardHolderName);

                p.makePayment(cardAmount);
                p.paymentDetails();

                break;


            case 2:

                System.out.print("Enter UPI ID: ");
                String upiId = br.readLine();

                System.out.print("Enter User Name: ");
                String userName = br.readLine();

                System.out.print("Enter Amount: ");
                double upiAmount = Double.parseDouble(br.readLine());

                p = new UPIPayment(upiId, userName);

                p.makePayment(upiAmount);
                p.paymentDetails();

                break;


            case 3:

                System.out.print("Enter Customer Name: ");
                String customerName = br.readLine();

                System.out.print("Enter Amount: ");
                double cashAmount = Double.parseDouble(br.readLine());

                p = new CashPayment(customerName);

                p.makePayment(cashAmount);
                p.paymentDetails();

                break;


            default:

                System.out.println("Invalid Choice!");
        }
    }
}