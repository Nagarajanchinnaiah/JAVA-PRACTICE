public class BankAccount {
 
    private double balance;
 
    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid Amount!!!");
        }
    }
 
    public double getBalance() {
        return balance;
    }
 
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(20000);
        System.out.println("Balance : " + b.getBalance());
    }
 
}