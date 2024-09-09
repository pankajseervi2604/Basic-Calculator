import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Welcome to basic Calculator");
        System.out.println("menu");
        System.out.print("1. ADDITION \n2. SUBTRACTION \n3. MULTIPLICATION \n4. DIVISION \n");
        System.out.println("Enter your choice : ");
        int choice = sn.nextInt();
        System.out.println("enter the values of A and B respectively : ");
        int a = sn.nextInt();
        int b = sn.nextInt();
        switch(choice)
        {
            case 1:{
                System.out.println("The addition is "+(a+b));
                break;
            }
            case 2:{
                System.out.println("The subtraction is "+(a-b));
                break;
            }
            case 3:{
                System.out.println("The multiplication is "+(a*b));
                break;
            }
            case 4:{
                System.out.println("The division is "+(a/b));
                break;
            }
        }
        sn.close();
    }
}
