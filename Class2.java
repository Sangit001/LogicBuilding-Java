import java.util.*;
// Make a factorial of a given number
        public class Class2{
            public static void main(String[] args){
        // first we have to ask from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
               
               // factorial of given number
               for(int i = 1; i<=n; i++){
                f = f * i;
               }
               System.out.println("The factorial of " +n+" is "+f);
               
            }
        }

