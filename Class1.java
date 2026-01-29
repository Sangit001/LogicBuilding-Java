
/*
        If we mode(%) any number with 10 then the reminder
        will always give its last number.

        For Example:-   System.out.println(105%10); Answer is 5

        If any number divide(/) with 10 then the answer will always
        give front number except last one.

        For Example:-   System.out.println(105/10); Answer is 10


*/

//  Write a program to print the last number of 1054 and print the first number.

        public class Class1{
            public static void main(String[] args){
               int number = 3054;
               System.out.println("The last number of "+number+ "is " +1054%10);
               
               // To print the first number Divide by 10
               int convert = (number/100);
            //    divided 1054 by 10 and answer is 10
               int finalResult = (convert/10);
               System.out.println("The first number of "+ number + " is" + finalResult);
            }
        }

