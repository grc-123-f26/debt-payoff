import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.62, 600);
        costco.setName("Visa Gold");
        System.out.println(costco.getName());
        System.out.println(target.getName());


        Scanner scan = new Scanner(System.in);

        // Make an empty arraylist to hold aprs
        List<Double> aprs = new ArrayList<>();


        
        //double[] aprs = new double[5];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist
            aprs.add(apr);
            
            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);

            //String aprString = String.format("%.2f%%", apr);
            //String balanceString = String.format("$%.2f", balance);
            //System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);

        //sort arraylist
        //print arraylist
    }
}
