public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String s ){
        super(s);
    }

    public static void main(String[] args) {
        BankAccount2 ba = new BankAccount2(4000);
        ba.deposit(500);
        ba.withdraw(500);  //do not show any error

    }
}
