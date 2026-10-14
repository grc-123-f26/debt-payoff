import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class PayoffApp {
    public static void main(String[] args) {

        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.62, 600);
        // System.out.println(target.getName());
        // costco.setName("Visa Gold");
        // System.out.println(costco);
        // System.out.println(costco.getName());

        costco.compareTo(target);
        // System.out.println(target.compareTo(costco));
        // System.out.println(target.compareTo(target));
        Scanner scan = new Scanner(System.in);

        // Make an empty arrayList to hold aprs
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();

        System.out.println(costco.monthlyInterest());
        costco.accrueInterest();
        System.out.println(costco.getBalance());

        for (int i = 0; i < 12; i++)
        {
            costco.accrueInterest();
        }
        System.out.println(costco.getBalance());

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

        // sort arraylist


        // print arraylist
    }
}
