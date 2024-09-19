//creating the Calculator which calculates additon, subtraction, multiplication, division, average, modulus, percentage, power^2, factorial (nCr,nPr), simple interest
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
    
        //importing Scanner class for user input
        Scanner sn = new Scanner(System.in);

        //Welcome greetings
        System.out.println("Welcome to basic Calculator");
        System.out.println("menu"); 
        int response;
        do{
            System.out.print("1. ADDITION \n2. SUBTRACTION \n3. MULTIPLICATION \n4. DIVISION \n5. REMAINDER (MODULUS) \n6. AVERAGE \n7. PERCENTAGE \n8. POWER  \n9. FACTORIAL \n10. SIMPLE INTEREST\n"); //displaying menu
            System.out.println("Enter your choice : ");
            int choice = sn.nextInt();
            int a,b;
            switch(choice)
            {
                case 1:{

                    //this is for basic addition 
                    System.out.println("enter the values of A and B respectively : ");
                    a = sn.nextInt();
                    b = sn.nextInt();
                    System.out.println("The addition is "+(a+b)); 
                    break;
                }
                case 2:{

                    //this is for basic subtraction 
                    System.out.println("enter the values of A and B respectively : ");
                    a = sn.nextInt();
                    b = sn.nextInt();
                    System.out.println("The subtraction is "+(a-b)); 
                    break;
                }
                case 3:{

                    //this is for basic multiplication
                    System.out.println("enter the values of A and B respectively : ");
                    a = sn.nextInt();
                    b = sn.nextInt();
                    System.out.println("The multiplication is "+(a*b));
                    break;
                }
                case 4:{

                    //this is for basic devision
                    System.out.println("enter the values of A and B respectively : ");
                    a = sn.nextInt();
                    b = sn.nextInt();
                    System.out.println("The division is "+(a/b)); 
                    break;
                }
                case 5:{

                    //this is for basic remainder calculation
                    System.out.println("enter the values of A and B respectively : ");
                    a = sn.nextInt();
                    b = sn.nextInt();
                    System.out.println("The remainder is "+(a%b));
                    break;
                }
                case 6:{

                    //this is for basic average calculation
                    Average avg = new Average();
                    avg.avgCalc();
                    break;
                }   
                case 7:{

                    //this is for basic percentage calculation
                    Percentage percent = new Percentage();
                    percent.percentCalc();
                    break;
                }
                case 8:{

                    //this is for basic power calculation
                    power pow = new power(); 
                    pow.powCalc();
                    break;
                }   
                case 9:{

                    //this is for basic factorial
                    Factorial fact = new Factorial();
                    fact.factorialCalc();
                    break;
                }
                case 10:{

                    //this is for basic interest calculator
                    simpleInterest si = new simpleInterest();
                    si.simpleInterestCalc();
                    break;
                }
            }
            System.out.println("press 0 to continue (or) press 1 to exit");
            response = sn.nextInt();
        }while(response == 0);
        System.out.println("------------");
        System.out.println("Thank You :)");
        System.out.println("------------");
        sn.close();
    }
}
