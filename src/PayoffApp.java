import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PayoffApp {
    public static void main(String[] args) {
         CreditCard costco = new CreditCard("Costco VISA", 5.5 , 2000);
         CreditCard target = new CreditCard("Red Card", 20.5 , 10);

         System.out.println("Payment is: " + costco.monthlyInterest());
         for (int i = 0; i < 120; i++) {
            costco.accrueInterest();
            System.out.println(costco.getBalance());
         }
         System.out.println("Payment is: " + costco.monthlyInterest());

        //  System.out.println(target.compareTo(costco));
        //  System.out.println(target.compareTo(target));
        //  System.out.println(costco.compareTo(target));
        
        // costco.setName("Visa Guld");
        // System.out.println(costco);
        // System.out.println(target.getName());




        Scanner scan = new Scanner(System.in);

        //create apr and balance arraylists
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();
        List<Double> bals = new ArrayList<>();

        

        while(scan.hasNextLine()) {
            

            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            //add apr and balance to list
            aprs.add(apr);
            bals.add(balance);


            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            cards.add(card);

            System.out.println(card);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        Collections.sort(bals, Comparator.reverseOrder());

        Collections.sort(cards, Comparator.reverseOrder());

        System.out.println(cards);
        //System.out.println(aprs);
        //System.out.println(bals);

        //System.out.println(costco);

        //System.out.println("Using Avalanche Method, first you should pay off: " + aprs.getFirst());

        //sort lists

        /* 
       
        //print lists

        System.out.println(aprs);
        System.out.println(bals);
        System.out.println("Using Avalanche Method, first you should pay off: " + aprs.getFirst());

        */

        scan.close();
    }
}
