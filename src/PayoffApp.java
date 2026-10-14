 import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class PayoffApp {
    public static void main(String[] args) {

       CreditCard Costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard Target = new CreditCard("Red Card", 37.62, 600);

        // System.out.println(Target.compareTo(Costco));
        // System.out.println(Target.compareTo(Target));
        // System.out.println(Costco.compareTo(Target));
        // System.out.println(Costco.monthlyInterest());
        //  Costco.setName("Visa Gold");
        // System.out.println(Costco.getName());
        // System.out.println(Target.getName());
        for(int i = 0; i < 12; i++) {
            Costco.accureInterest();
        }
        System.out.println(Costco.getBalance());

        Scanner scan = new Scanner(System.in);

        // Make an empty arraylist to hold aprs
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();

        //double[] aprs = new double[S];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();
            // add apr to arraylist
            aprs.add(apr);
            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            // add the new card to cards list
            cards.add(card);
           /*  String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString); */
        } 

        // sort arraylist
        Collections.sort(aprs, Comparator.reverseOrder());

        // print arraylist
        System.out.println(aprs.toString());
        // reverse the order of the cards list
        Collections.sort(cards, Comparator.reverseOrder());
        // and print it
        System.out.println(cards);

    }
}
