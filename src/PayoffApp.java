import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // CreditCard costco = new CreditCard("Costco",20.33,300);
        // CreditCard target = new CreditCard("Red Card", 30, 600);
        // System.out.println(costco);
        // costco.setName("Visa Gold");
        // System.out.println(costco);
        // System.out.println(target.getName());
        //double[] aprs = new double[]; 
        //Make empty arraylist to hold aprs
        List<Double> aprs = new ArrayList<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();
            //add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name,apr,balance);
            System.out.println(card);
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);
        //Sort arraylist
        //Print arraylist
    }
}
