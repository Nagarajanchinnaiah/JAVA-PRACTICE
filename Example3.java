class BankAccount{
    double balance=1000;
 
    void deposit(double amount){
        balance+=amount; // balance=balance+amount
        System.out.println("Deposited : "+amount);
    }
}
 
class SavingsAccount extends BankAccount{
    void displayBalance(){
        System.out.println("Current Balance : "+balance);
    }
}
 
public class Example3{
    public static void main(String[] args) {
        SavingsAccount SA=new SavingsAccount();
        SA.deposit(40000);
        SA.displayBalance();
    }
}