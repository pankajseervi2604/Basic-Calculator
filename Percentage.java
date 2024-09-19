//To calculate the percentange of the given number 
import java.util.Scanner;
public class Percentage {
    
    //importing Scanner Class
    Scanner sn = new Scanner(System.in);

    //calculating percentage
    public void percentCalc(){
        System.out.println("Enter the number (marks) : ");
        int x = sn.nextInt();
        System.out.println("Enter the total Number (marks outoff) : ");
        int total = sn.nextInt();
        int precent = (x/total) * 100;
        System.out.println("The precentage of given number is : "+precent);
    }
}
