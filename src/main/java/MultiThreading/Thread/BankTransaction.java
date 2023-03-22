package MultiThreading.Thread;

import java.util.Scanner;

class Customer {

    int amount = 10000;

    public synchronized void withdraw() {

        System.out.println("\nYour Current Balance is : " + amount);

        System.out.println("\nWithdrawing ...\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter Amount to Withdraw : ");
        long amnt = new Scanner(System.in).nextLong();

        if (amount < amnt) {

            System.out.println("\nNot enough Balance\nFirst Deposit : ");

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        amount -= amnt;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nWithdrawal Success");

//        notify();

    }

    public synchronized void displayBalance(){

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nBalance : " + amount);

    }

    public synchronized void deposit() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter Amount to Deposite : ");
        long amnt = new Scanner(System.in).nextLong();

        amount += amnt;

        System.out.println("\nDeposite Successfull");

        notifyAll();

    }

}

public class BankTransaction {

    public static void main(String[] args) {

        Customer customer = new Customer();

        new Thread(){

            @Override
            public void run() {
                customer.withdraw();
            }
        }.start();

        new Thread(){

            @Override
            public void run() {
                customer.deposit();
            }
        }.start();

        new Thread(){

            @Override
            public void run() {
                customer.displayBalance();
            }
        }.start();
    }
}


