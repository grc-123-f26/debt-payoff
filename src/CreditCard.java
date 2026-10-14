public class CreditCard implements Comparable<CreditCard>{
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
   public double getBalance() {
      return balance;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String toString() {
      return "Name: " + name + ", APR: " + apr + "%, Balance: " + balance;    
   }

   public double monthlyInterest() {
      //apr /12 = monthly interest rate
      // monthly interest rate * balance = monthly interest
      double monthlyRate = apr/12/100;
      return monthlyRate * balance;
   }

   public void accrueInterest() {
      //Increase balance by 1 month's interest
      balance+= monthlyInterest();
   }

   public int compareTo(CreditCard other) {
      //compare this to other
      if(this.apr < other.apr) {
         return -1;
      }
      if (this.apr == other.apr) {
         return 0;
      }
      return 1;
   }
   
}