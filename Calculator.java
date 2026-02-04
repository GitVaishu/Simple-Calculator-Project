package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Project Template");
        System.out.println("Members will implement operations separately.");
        int num1;
        int num2;
        System.out.println("Enter two numbers to perform calculations:");
        // Input handling can be added here
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int result;
        //create new function for each operation
        result = multiply(num1, num2);
    
        System.out.println(result);

        result = divison(num1, num2);
        System.out.println(result);

        result = Substraction(num1, num2);
        System.out.println(result);
    }
    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divison(int a, int b) {
        return a / b;
    }
    private static int Substraction(int a,int b)
    {
        return a-b;
    }
   
}
