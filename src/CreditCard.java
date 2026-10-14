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
     public String setName(String name) {
        this.name = name;
        return name;

     }

     public double getApr() {
         return apr;
     }
      public double setApr(double apr) {
        this.apr = apr;
        return apr;
      }

      public double getBalance() {
         return balance;
     }
     public double setBalance(double balance) {
        this.balance = balance;
        return balance;
     }

     @Override 
     public String toString() {
        return name + " " + " APR: " + apr + "% Balance: " + balance;
     }

     public double monthlyInterest() {
      // apr / 12 = monthly interest rate
      // monthly interest rate * balance = monthly interest
      double monthlyInterestRate = apr / 12 / 100;
      return monthlyInterestRate * balance;
     }

     public void accureInterest() {
      // Increase my balance by one month's interest
      balance += monthlyInterest();

     }

     @Override
     public int compareTo(CreditCard other) {
      if(this.apr < other.apr) {
         return -1;
      }
      if(this.apr == other.apr) {
         return 0;
      }
      return 1;
     }

}