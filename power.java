//To calculate the power of given number 
import java.util.Scanner;
public class power {

    //importing Scanner class
    Scanner sn = new Scanner(System.in);

    //calculating the power using math function 
    public void powCalc(){
        System.out.println("The formate of power calculator would be X^p");
        System.out.println("Enter the value of X : ");
        double x = sn.nextDouble();
        System.out.println("Enter the value of p : ");
        double p = sn.nextDouble();

        // checking the power condition
        if(x != 0) {
            if(p == 0){
            System.out.println("Any value power zero is always one (1).");
            } else {
            System.out.println("The power is : "+Math.pow(x, p));
            }
        } else {
            System.out.println("0 raised to any power is 0.");
        }
    }
}
