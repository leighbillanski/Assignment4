package OCP;

public class BankAccount {

    private String name = "Kay";
    private  String sname = "John";
    private String accNum = "012352155";

    public BankAccount(){}

    public BankAccount(String name,String last,String account) {
        this.name = name;
        this.sname = last;
        this.accNum = account;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }
}
