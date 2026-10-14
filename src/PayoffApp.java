import java.util.*;
import java.io.*;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard myCard = new CreditCard("Danh", 20.3, 3000);
        CreditCard target = new CreditCard("Red Card", 20.3, 3000);
        System.out.println(target.compareTo(myCard));

        // myCard.setName("Visa Platinum");
        // System.out.println(myCard.getName());
        // System.out.println(target.getName());
        
        for (int i = 0; i < 12; i++) {
            myCard.accrueInterest();
        }

        System.out.println(myCard.monthlyInterest());
        // make an empty arraylist to hold aprs
        List<Double> aprs = new ArrayList<Double>();
        List<CreditCard> cards = new ArrayList<>();
        // double[] aprs = new double[5];




        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

        //     // add apr to arrayList
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
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

        // sort arraylist 
        // print arraylist
    }
}
