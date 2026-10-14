import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PayoffApp {
    public static void main(String[] args) {
        
        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.62, 600);

        //System.out.println(target.compareTo(costco));
        //System.out.println(target.compareTo(target));
        //System.out.println(costco.compareTo(target));

        for(int i = 0; i < 12 ; i++){
            costco.accrueInterest();
        }

        System.out.println(costco.monthlyInterest());
        //System.out.println(costco.getBalance());
        //costco.setName("Visa Gold Blyat");
        System.out.println(costco);
        System.out.println(target);
        Scanner scan = new Scanner(System.in);

           //make empty arraylist to hold aprs

        List<Double> aprList = new ArrayList<>();
        List<CreditCard> cards = new ArrayList<>();
        

        //double[] nprArray = new double[10000];


        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

             // add aprs to arraylist
            
            aprList.add(apr);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard Ncards = new CreditCard(name, apr, balance);
            System.out.println(Ncards);

           // String aprString = String.format("%.2f%%", apr);
           // String balanceString = String.format("$%.2f", balance);
           // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
         // sort and print arraylist
        Collections.sort(aprList, Comparator.reverseOrder());
        System.out.println(aprList);

        Collections.sort(cards, Comparator.reverseOrder());
        System.out.println(cards);

        scan.close();
    }
}
