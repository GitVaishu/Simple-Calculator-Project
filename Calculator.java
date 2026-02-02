package calculator;
import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }
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

        int res = add(num1, num2);

        int result;
        //create new function for each operation
    
        System.out.println(result);
    }
}
