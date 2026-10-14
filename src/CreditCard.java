public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name, double apr, double balance){
      this.name = name;
      this.apr = apr;
      this.balance = balance;
    }

    // toString
    public String toString() {
      return name + " APR: " + apr + "% Balance: " + balance;
    }

    // Getter and Setter
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

    public double monthlyInterest(){
      // apr / 12 = monthly interest rate
      // monthly interest rate * balance = monthly interest
      double monthlyRate = apr/ 12/100;
      return monthlyRate * balance;
    }

    public void accruelInterest(){
      // Increase balance by one month's interest
      balance += monthlyInterest();

    }
    public int compareTo(CreditCard other){
      // comparing this to other
      if(this.apr < other.apr){
        return -1;
      }
      if(this.apr == other.apr){
        return 0;
      }
      return 1;
    }

}