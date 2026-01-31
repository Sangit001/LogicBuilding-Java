public class SwapNumber{
    public static void main(String[] args){
        
        // Initialization 
        // int num1 = 10;
        // int num2 = 20;
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        // System.out.println(num1);
        // System.out.println(num2); 

        // Swapping the value without using third variable

        int a = 50;
        int b = 30;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}