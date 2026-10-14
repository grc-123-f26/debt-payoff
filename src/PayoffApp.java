import java.util.*;

public class PayoffApp {
    public static void main(String[] args) {
        CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        CreditCard target = new CreditCard("Red Card", 37.33, 200);
        costco.setName("Visa Gold");
        System.out.println(costco.getName());
        System.out.println(target.getName());

        costco.accrueInterest();
        System.out.println(costco.getBalance());
        

        // make empty Apr ArrayList
        List<Double> aprs = new ArrayList<>(); 

        // make empty credCard ArrayList
        List<CreditCard> credCard = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            credCard.add(card);
            System.out.println(card);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
        scan.close();
        Collections.sort(aprs, Comparator.reverseOrder());
        Collections.sort(credCard, Comparator.reverseOrder());

        System.out.println(aprs);
        System.out.println(credCard);
    }
}