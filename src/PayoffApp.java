import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class PayoffApp {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("Darwin Chase", 19.99, 5000);
        CreditCard card2 = new CreditCard("Darwin Costco", 15.99, 3000);
        System.out.println(card1.toString());

        card1.compareTo(card2);
        System.out.println(card1.compareTo(card2));

        System.out.println(card1.getName());
        System.out.println(card2.toString());
          
        Scanner scan = new Scanner(System.in);

        //ArrayList<Double> aprs = new ArrayList<>(); // Using an ArrayList for dynamic sizing
        List<Double> aprs = new ArrayList<>(); // Using an ArrayList for dynamic sizing
        //double[] aprs = new double[100]; // Assuming a maximum of 100 debts


        List<CreditCard> cards = new ArrayList<>(); // List to store CreditCard objects
        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();
            CreditCard card = new CreditCard(name, apr, balance);
            cards.add(card);

            // add the apr to the arraylist
            aprs.add(apr);
            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();
           
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
         Collections.sort(aprs, Comparator.reverseOrder()); //sort arraylist
         Collections.sort(cards, Comparator.reverseOrder()); //sort cards by apr
         //print aprs 
              System.out.println(cards);     
              System.out.println(aprs);
        
    
    }
}

