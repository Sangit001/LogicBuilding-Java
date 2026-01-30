import java.util.*;

/*
        If we mode(%) any number with 10 then the reminder
        will always give its last number.

        For Example:-   System.out.println(105%10); Answer is 5

        If any number divide(/) with 10 then the answer will always
        give front number except last one.

        For Example:-   System.out.println(105/10); Answer is 10


*/

//  Write a program to print the last number of 1054 and print the first number.

        class Logic{
            public void length();
            public void front();
            public void back();

            int diviser;
            int result;
            int length;
        }
        class Display extends Logic{

            void length(){
                while (number > 0){
                    number = number/10;
                    length ++;
                    System.out.println(length);
                }
                
            }
            void back(){
                int back = number % 10;
                System.out.println("The last number is of "+number+" is: " +back);
                
            }
            void front(){
                int front = number/length
            }

        }

        public class Class1{

            public static void main(String[] args){
                
            //     // Created scanner object
            //     Scanner sc = new Scanner(System.in);

            //     // number asking from user
            //    int number = sc.nextInt(); // 1002

            //    System.out.println("The last number of "+number+ "is " +number%10);
               
            //    // To print the first number Divide by 10, but if the number is too long
            //    int divider = 10;


            //    // Using while loop to trace the length of the given number
            //    int length = 0;
            //    while(number > 0){
            //     number = number/10;
            //     length++;
            //    }
            //    System.out.println("length of given number is: "+length);

            //    for (int i = 1; i<length-2; i++){
            //     divider *= 10;
            //    }
            //    System.out.println(divider);
            //   int convert = (number/divider);

            // //    divided 1054 by 10 and answer is 10
            //    int finalResult = (convert/10);
            //    System.out.println("The first number of "+ number + " is" + finalResult);

            int number = 12345;
            Display d = new Display();
            display.length();





            }
        }

