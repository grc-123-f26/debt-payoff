public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;

    // Constructor
    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    public String toString() {
        return name + " | APR: " + apr + "% Balance: " + balance;
    }

    public double monthlyInterest() {
        // APR / 12 = monthly interest rate
        // monthly interest rate * balance = monthly interest
        double monthlyInterestRate = apr / 12 / 100;
        return monthlyInterestRate * balance;
    }

    public void accrueInterest() {
        // Increase my balance by one month's interest
        balance += monthlyInterest();
    }

    public int compareTo(CreditCard other) {
        // Comparing this to other
        if(apr < other.apr) {
            return -1;
        }
        if(apr == other.apr) {
            return 0;
        }
        return 1;
    }
}