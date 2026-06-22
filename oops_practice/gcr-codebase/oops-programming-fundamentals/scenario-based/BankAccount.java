import java.util.Scanner;

public class BankAccount{
    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts=0;

    public BankAccount(int accountNumber, String holder, double balance){
        this.accountNumber=accountNumber;
        this.holder=holder;
        this.balance=balance;
        totalAccounts++;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposit" +amount);
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("insufficient balance");
        }else{
            balance-=amount;
            System.out.println("withdraw" +amount);
        }
    }
    public void getStatement(){
        System.out.println("Account Number" + accountNumber);
        System.out.println("Holder" + holder);
        System.out.println("Balance" + balance);
    }
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "Amit", 10000);

        BankAccount account2 = new BankAccount(102, "Rahul", 15000);

        BankAccount account3 = new BankAccount(103, "Ankit", 20000);

        account1.deposit(1000);
        account1.withdraw(500);
        account1.deposit(2000);
        account1.withdraw(3000);
        account1.deposit(500);

        account2.deposit(1500);
        account2.withdraw(2000);
        account2.deposit(3000);
        account2.withdraw(1000);
        account2.deposit(500);

        account3.deposit(4000);
        account3.withdraw(2500);
        account3.deposit(1000);
        account3.withdraw(5000);
        account3.deposit(700);

        account1.getStatement();
        account2.getStatement();
        account3.getStatement();

        System.out.println("\nTotal Accounts Created: " + totalAccounts);
    }
}



