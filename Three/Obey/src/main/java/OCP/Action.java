package OCP;

public class Action extends BankAccount{

    private double balance = 50.00;

    public Action(){

    }

    public Action(String name, String last, String account, double balance){
        super(name, last, account);
        this.balance = balance;
    }

    public double withdraw(double amount){
        if(balance>= amount){
            balance -= amount;
        }
        return  balance;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public String toString(){
        return "Name : "+ super.getName() + "\n Surname : " + super.getSname() + "\n Account Number : " + super.getAccNum() + "\n Balance : " + balance;
    }
}
