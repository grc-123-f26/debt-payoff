import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class PayoffApp {
    public static void main(String[] args) {
        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.62, 600);

        // System.out.println(target.compareTo(costco));
        // System.out.println(costco.compareTo(target));
        // System.out.println(target.compareTo(target));

        for (int i = 0; i < 12; i++) {
            costco.accrueInterest();
        }
        System.out.println(costco.getBalance());

        System.out.println(costco.monthlyInterest());
        // costco.setName("Visa Gold");
        // System.out.println(costco.getName());
        // System.out.println(target.getName());

        Scanner scan = new Scanner(System.in);

        // Make an empty arrayList to hold aprs
        List<Double> aprs = new ArrayList<>();

        // Make an empty arrayList to hold CreditCard objects
        List<CreditCard> cards = new ArrayList<>();

        //double[] aprs = new double[5];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arrayList
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            // add the new card to our cards list
            cards.add(card);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);


        Collections.sort(cards, Comparator.reverseOrder());
        System.out.println(cards);

        // sort arrayList
        // print arrayList
    }
}
