import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        
        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard card = new CreditCard("Cardomana", 80, 10000);
        costco.setName("Visa Gold Blyat");
        System.out.println(costco);
        Scanner scan = new Scanner(System.in);

        //make empty arraylist to hold aprs

        List<Double> aprList = new ArrayList<>();
        

        //double[] nprArray = new double[10000];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            //add apr to arraylist

            aprList.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);

        }
        //sort
        //print all out
        Collections.sort(aprList, Comparator.reverseOrder());
        System.out.println(aprList);

        scan.close();
    }
}
