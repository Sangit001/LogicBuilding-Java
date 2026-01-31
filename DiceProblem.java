import java.util.Scanner;
public class DiceProblem{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 6.");
        int input = sc.nextInt();

        switch(input){
            case 1:
                System.out.println("The opposite of 1 is "+6);
                break;
            case 2:
                System.out.println("The opposite of 2 is "+5);
                break;
            case 3:
                System.out.println("The opposite of 3 is "+4);
                break;
            case 4:
                System.out.println("The opposite of 4 is "+3);
                break;
            case 5:
                System.out.println("The opposite of 5 is "+2);
                break;
            case 6:
                System.out.println("The opposite of 6 is "+1);
                break;
            default:
                System.out.println("Sorry the number you have enter is out of range.");
                break;
        }



    }
}