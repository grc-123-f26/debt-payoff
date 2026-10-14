import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

import java.util.Scanner;


public class PayoffApp {

public static void main(String[] args) {


CreditCard costco = new CreditCard("Costco", 20.33, 300);

CreditCard target = new CreditCard("target", 80, 10000);

costco.setName("costco");

System.out.println(costco);
System.out.println(costco);
System.out.println(costco);
System.out.println(costco.oneMonthBalanceinterestSum());
System.out.println(costco.oneMonthBalanceinterestSum()+costco.getApr());
System.out.println(costco);

Scanner scan = new Scanner(System.in);


costco.oneMonthBalanceinterestSum();

System.out.println(costco.getName() + " monthly interest: " + costco.monthlyInterest());
List<Double> aprList = new ArrayList<>();


List<CreditCard> cards = new ArrayList<>();



//double[] nprArray = new double[10000];


while(scan.hasNextLine()) {

String name = scan.nextLine();


double apr = scan.nextDouble();

double balance = scan.nextDouble();


//add apr to arraylist


aprList.add(apr);


// Consume \n after balance input 

if(scan.hasNextLine()) scan.nextLine();


CreditCard card1 = new CreditCard(name, apr, balance);

cards.add(card1);

// String aprString = String.format("%.2f%%", apr);

// String balanceString = String.format("$%.2f", balance);

// System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);


}

//sort

//print all out

Collections.sort(aprList, Comparator.reverseOrder());

System.out.println(aprList);


Collections.sort(cards, Comparator.reverseOrder());

System.out.println(cards);


scan.close();

}

}