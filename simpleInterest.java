//To calculate the simple interest of the given amount
import java.util.Scanner;
public class simpleInterest {
    
    //importing Scanner class
    Scanner sn = new Scanner(System.in);

    //calculating simple interest
    public void simpleInterestCalc(){

        //asking user to enter the amount , number of months and rate of interest (%)
        System.out.println("Enter the amount :");
        int amt = sn.nextInt();
        System.out.println("Enter the number of months : ");
        int months = sn.nextInt();
        System.out.println("Enter the rate of interest in precent : ");
        int roi = sn.nextInt();

        //calculating the interest
        int interest = (amt*roi) / 100;
        int totInterest = interest * months;
        System.out.println("The interest of given amount is : "+totInterest);
        System.out.println("The total amount would be "+(amt+totInterest));
    }
}
