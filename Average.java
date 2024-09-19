//To calculate the average of the given numbers 
import java.util.Scanner;
public class Average {
    
    //importing Scanner class
    Scanner sn = new Scanner(System.in);

    //calculating the average 
    public void avgCalc(){
        int size;

        //checking whether the length of array is not less or equal to zero
        do{
            System.out.println("Enter the length of numbers ? ");
            size = sn.nextInt();
            if(size <= 0){
                System.out.println("please re-enter the length of number");
            }
        }while(size <= 0);

        //initializeing the array 
        double[] arr = new double[size];

        //asking user to enter the numbers
        System.out.println("Enter the number that you would to calculate : ");
        
        //using for loop accessing all the numbers that user enters 
        for(int i=0;i<size;i++){
            arr[i] =sn.nextDouble();
        }

        //adding all the numbers from array and storing it in variable 
        int totalSum = 0;
        for(double i : arr){
            totalSum+=i;
        }
        System.out.println("The average of given numbers is : "+(totalSum/size)); //displaying the average 
    }
}
