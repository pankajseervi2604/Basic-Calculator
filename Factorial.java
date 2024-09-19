//To calculate the factorial of the given numbers and finding the nCr and nPr 
import java.util.Scanner;
public class Factorial {
    
    //importing Scanner class
    Scanner sn = new Scanner(System.in);

    //calculating the factorial
    public void factorialCalc(){

        //asking to choose the option 
        System.out.println("Choose the option >");
        System.out.println("1. Factorial of number \n2. Calculate premutation (nPr)\n3. Calculate combination (nCr)");
        int choice = sn.nextInt();
        
        //using switch case
        switch(choice){
            case 1:{
                factCalc();
                break;
            }
            case 2:{
                premutationCalc();
                break;
            }
            case 3:{
                combinationCalc();
                break;
            }
        }
    
    }

    //used to calculate the factorial of the given number
    public void factCalc(){

        System.out.println("Enter the number : ");
        int number = sn.nextInt();
        int fact = 1;

        //factorial of 1 is one
        if(number == 1){
            System.out.println("Factorial of 1 is 1");
        }else{
            for(int i=number;i>0;i--){
                fact*=i;
            }
        }
        System.out.println("The factorial of given number is : "+fact);

    }

    //used to calculate the nPr 
    public void premutationCalc(){
        int nFact = 1;
        int nrFact = 1;
        /*
         * formula for premutation 
         * n! / (n-r)!
         */
        System.out.println("Enter the number n : ");
        int n = sn.nextInt();
        System.out.println("Enter the number of r : ");
        int r = sn.nextInt();
        
        //finding n!
        for(int i=n;i>0;i--){
            nFact*=i;
        }

        //finding (n-r)!
        int p = n-r;
        for(int i=p;i>0;i--){
            nrFact*=1;
        }

        //displaying the result
        double premutation = nFact / nrFact;
        System.out.println("The premutation of given number is : "+premutation); 
    }

    //used to calcualte the nCr
    public void combinationCalc(){
        int nFact = 1;
        int rFact = 1;
        int nrFact = 1;
        /*
         * formula for combination
         * n! / r!(n-r)!
         */
        System.out.println("Enter the number n : ");
        int n = sn.nextInt();
        System.out.println("Enter the number of r : ");
        int r = sn.nextInt();
        
        //finding n!
        for(int i=n;i>0;i--){
            nFact*=i;
        }

        //finding r!
        for(int i=r;i>0;i--){
            rFact*=i;
        }

        //finding (n-r)!
        int p = n-r;
        for(int i=p;i>0;i--){
            nrFact*=1;
        }

        //displaying the result
        double combination = nFact / rFact*nrFact;
        System.out.println("The premutation of given number is : "+combination); 

    }
}
