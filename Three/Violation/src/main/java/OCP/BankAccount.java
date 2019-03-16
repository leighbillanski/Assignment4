package OCP;

public class BankAccount {

    private double balance = 50.00;
    private String name = "Kay";
    private String sname = "John";
    private long accNum = 012352155;

    public void withdraw(double amount){
        if(balance>= amount){
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Name : "+ name + "\n Surname : " + sname + "\n Account Number : " + accNum + "\n Balance : " + balance;
    }

}
