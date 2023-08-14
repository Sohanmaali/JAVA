/* 16)  Create a program that helps banks to maintain records. It should havefollowing facilities.
Anybody can create current or saving account with following initial information:
account number, name, balance, and branch. 
display account detail for a particular accounts. 
display total money deposited in bank. 
allow deposit and withdrawal in an account . 
for saving account opening balance and minimum balance must be 5000.
for current account opening balance and minimum balance must be 1000.
can not withdraw the amount from the account that makes balance less than the minimum balance.*/

import java.util.Scanner;

class Bank {
    private long accNum;
    private String name;
    private double balance;
    private String branch;
    private String accType;

    public Bank() {

    }

    public Bank(long accNum, String name, double balance, String branch, String accType) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
        this.accType = accType;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccType() {
        return accType;
    }

}

abstract class OpenAccount {
    public abstract void accountOpean(Bank bank, OpenAccount op);

    public abstract void withdraw(Bank bank, double withAmount);

    public abstract void DipositAmount(Bank bank, double dipositAmount);
}

class SavingAccount extends OpenAccount {
    public void accountOpean(Bank bank, Operation op) {
        if (bank.getBalance() >= 5000) {
            op.showDaitails();
        }
    }

    public void withdraw(Bank bank, double withAmount) {
        if (bank.getBalance() >= (withAmount - bank.getBalance())) {
            System.out.println("Please Enter Sufficient Amout");
        } else {
            System.out
                    .println("Amount Withdraw Succesfully Your Curent Amout is = " + (bank.getBalance() - withAmount));
        }
    }

    public void DipositAmount(Bank bank, double dipositAmount) {

        System.out.println("Amount Diposit Succesfully Your Curent Amout is = " + (bank.getBalance() + dipositAmount));

    }
}

class CurrentAccount extends OpenAccount {
    public void accountOpean(Bank bank, Operation op) {
        if (bank.getBalance() >= 1000) {
            op.showDaitails();
        }
    }

    public void withdraw(Bank bank, double withAmount) {
        if (bank.getBalance() >= (withAmount - bank.getBalance())) {
            System.out.println("Please Enter Sufficient Amout");
        } else {
            System.out
                    .println("Amount Withdraw Succesfully Your Curent Amout is = " + (bank.getBalance() - withAmount));
        }
    }

    public void DipositAmount(Bank bank, double dipositAmount) {

        System.out.println("Amount Diposit Succesfully Your Curent Amout is = " + (bank.getBalance() + dipositAmount));

    }
}

class Operation {
    Bank bank;

    public void showDaitails() {
        System.out.println("\t\t\t Congretulation Your Account Is Opend");
        System.out.println("Your account Daitails Are\n");
        System.out.println("Account Type = " + bank.getAccType());
        System.out.println("\nAccound Holder Name = " + bank.getName());
        System.out.println("\nYour Branch = " + bank.getBranch());
        System.out.println("\nYour Branch = " + bank.getBalance());
    }

}

class Main {
    public static void main(String[] args) {

        long accNum;
        String name;
        double balance;
        String branch;
        String accType;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Type");
        accType = sc.nextLine();

        System.out.println("Enter Account Holder Name");
        name = sc.nextLine();

        System.out.println("Enter Bank Name");
        name = sc.nextLine();

        System.out.println("Enter Branch");
        branch = sc.nextLine();

        System.out.println("Enter Account Number");
        accNum = sc.nextLong();

        System.out.println("Enter Balance");
        balance = sc.nextDouble();

        Bank bank = new Bank(accNum, name, balance, branch, accType);

        Operation op = new Operation();

        System.out.println("Do you Want to parform more operation\n 1 For Yes\n 2 For No");
        int moreOperation = sc.nextInt();
        if (moreOperation == 1) {
           
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SavingAccount sacc = new SavingAccount();
                    sacc.accountOpean(bank, op);
                    System.out.println("Enter Withdrow Amout");
                    Double withAmount = sc.nextDouble();
                    sacc.withdraw(bank, withAmount);
                     System.out.println("\t\t\tYour Choice Are");
                    System.out.println("1 For Withdrow");
                    System.out.println("2 For Diposit");
                    System.out.println("Enter Your Choice");
                     switch(choice)
                    {

                    }
                    break;
                case 2:
                    CurrentAccount cacc = new CurrentAccount();
                    cacc.accountOpean(bank, op);
                    System.out.println("Enter Diposit Amout");
                    Double dipositAmount = sc.nextDouble();
                    cacc.DipositAmount(bank, dipositAmount);
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}