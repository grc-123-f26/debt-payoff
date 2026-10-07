import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        // CreditCard usaa = new CreditCard("USAA CC", 15.1, 989.76);
        // CreditCard nfcc = new CreditCard("Navy Federal CC", 18.3, 123.47);
        // usaa.setName("USAA Credit Card");
        // System.out.println(usaa);
        // System.out.println(nfcc);
        // System.out.println(usaa.getName());
        // System.out.println(nfcc.getName());
        
        Scanner scan = new Scanner(System.in);
        
        // Make an empty arraylist to hold aprs
        List<Double> aprs = new ArrayList<>();

        // double[] aprs = new double[5];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            System.out.println(card);
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
            System.out.println("");
        }
        System.out.println("Normal: " + aprs);
        System.out.println("");

        // sort arraylist
        Collections.sort(aprs, Comparator.reverseOrder());

        // print arraylist
        System.out.println("Reversed: " + aprs);
    }
}