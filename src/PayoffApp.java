import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {

        CreditCard costco = new CreditCard("Costco visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 23.53, 140);

        // costco.compareTo(target);
        for(int i = 0; i < 12; i++){
            costco.accruelInterest();
        }
        
        System.out.println(costco.getBalance());
        //System.out.println(costco.monthlyPayment());
        // costco.setName("Visa Gold");
        // System.out.println(costco);
        // target.setName("Red Carf");
        // System.out.println(target);

        Scanner scan = new Scanner(System.in);

        // Make an arrayList to hold aprs
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();

        // double [] aprs = new double [5];


        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            //add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            // Add the new card in our card list
            cards.add(card);

            System.out.println(card);
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);

        Collections.sort(cards, Comparator.reverseOrder());
        System.out.println(cards);
        //sort arrayList
        //printList
    }
}