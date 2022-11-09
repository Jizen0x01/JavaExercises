import java.util.Scanner;
import java.math.*;
class Account{
    private int accountNo;
    private String name;
    private float amount;


    public String toString() {
        return "Account{" +
                "AccountNo=" + accountNo +
                ", Name='" + name + '\'' +
                ", Amount=" + amount +
                '}';
    }
    public void insert(int a,String n, float amt){
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
        System.out.println("Account Created Successfully");
        System.out.println("Account Number : "+a);
        System.out.println("Account Name : "+n);
        System.out.println("Balance : "+amt);
    }
    public void deposit(float amt){
        this.amount = amount + amt;
        System.out.println(amt + " " + "Deposited Successfully");
        System.out.println("Total Account Balance = "+amount);
    }
    public void withdraw(float amt){
        if(amt>amount)
            System.out.println("Insufficient Balance!!!");
        else
            this.amount = amount-amt;
        System.out.println(amount +" "+"Withdrawed Successfully");
    }
    public void checkBalance(){
        System.out.println("Account Balance = "+amount);
    }



}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc = new Account() ;
        String name;
        float balance,depositBalance,withdrawBalance;
        int accountID;
        int op = 0;

        System.out.println("Bank Management System");
        System.out.println("***********************");

        System.out.println("Please Open a New Account : ");
        System.out.print("Enter your Name : ");
        name = input.nextLine();
        System.out.print("Enter Account ID you want to create : ");
        accountID = input.nextInt();
        System.out.print("Enter the balance you want to deposit to open the account : ");
        balance = input.nextFloat();
        acc.insert(accountID,name,balance);
        System.out.println("***********************************************************");
        for(;true;){
            System.out.println("Enter the operation you want to do : ");
            System.out.println("" +
                    "1- Deposit\n" +
                    "2- Withdraw\n" +
                    "3- Check Balance\n" +
                    "4- Exit" +
                    "");
            op = input.nextInt();
            if(op == 4)
                break;

            switch (op) {
                case 1 -> {
                    System.out.println("Enter the balance you want to deposit : ");
                    depositBalance = input.nextFloat();
                    acc.deposit(depositBalance);
                }
                case 2 -> {
                    System.out.println("Enter the balance you want to withdraw : ");
                    withdrawBalance = input.nextFloat();
                    acc.withdraw(withdrawBalance);
                }
                case 3 -> acc.checkBalance();
                default -> System.out.println("Error, please choose a correct operation!");
            }



        }
