import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){

        // input from user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("The number you've enter is even.");
        }else{
            System.out.println("The number you've enter is odd.");
        }


    }
}