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
    
        System.out.println(result);
    }

    public class Division {

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

}                                 