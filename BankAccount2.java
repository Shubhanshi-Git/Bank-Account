//Write a Java program to simulate a simple banking application.
//        ● Create a class BankAccount with a balance and methods for deposit and
//withdrawal.
//● Implement exception handling for withdrawal operations to prevent overdrawing.
//● Handle the scenario when the withdrawal amount is greater than the balance.

public class BankAccount2 {
    private   double accountBalance;

    public BankAccount2(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void deposit(double amount){
        accountBalance = accountBalance + amount;
        System.out.println("Amount deposited  :  " +amount);
        System.out.println("your current balance : " +accountBalance);
    }
    public void withdraw ( double amount ){
       try{
           if( amount> accountBalance ){
             throw new InsufficientBalanceException ("you do not have sufficient amount in your account");
           }
           else{
               accountBalance = accountBalance - amount;
               System.out.println("Amount Withdrawl : " +amount);
               System.out.println("your  current Balance is :" +accountBalance);
           }
       }
       catch( InsufficientBalanceException  e ){
           System.out.println(e.getMessage());  // provides only description of exception i.e, insufficient balance
           System.out.println("=========================");
           System.out.println(e); //provides classs name and exception name
           System.out.println("============================");
           e.printStackTrace();  //provides complete description of exception included line in which exception occured
       }
    }
}
