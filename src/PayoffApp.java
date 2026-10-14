import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class PayoffApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CreditCard myCard = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.62, 600);
        System.out.println(target.compareTo(myCard));
        
        // System.out.println(target.compareTo(costco));
        // System.out.println(costco.compareTo(target));
        // System.out.println(target.compareTo(target));

        for(int i = 0; i<12; i++)
            {
                myCard.accrueInterest();
            }

        System.out.println(myCard.monthlyInterest());
        // Make an empty arrayList to hold aprs
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();

        //double[] aprs = new double[5];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            //add apr to arraryList
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);

            // add the new card to our cards list
            cards.add(card);
            // System.out.println(card);
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
     }
    
    Collections.sort(aprs, Comparator.reverseOrder());
    System.out.println(aprs);
    
    Collections.sort(cards, Comparator.reverseOrder());
    System.out.println(cards);
     //sort arrayList
     //print arrayList
    }
}
