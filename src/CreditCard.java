
public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;
    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getApr() {
        return apr; 
    }
    public double getBalance() {
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setApr(double apr) {
        this.apr = apr;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    } 
    public double monthlyPayneby() {
        double monthlyInterestRate = apr / 100 / 12;
        return balance * monthlyInterestRate;
    }
    public void accrueInterest() {
        balance += monthlyPayneby();
    }
    public String toString() {
        return name + ": " + "APR: " + apr + " Balance: " + balance;
    }
    public int compareTo(CreditCard other) {
        if(this.apr < other.apr) {
            return -1;
        } else if(this.apr > other.apr) {
            return 1;
        } else {
            return 0;
        }
    }
    
}