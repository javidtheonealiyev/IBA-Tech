
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operation type");
        char ch = scanner.next().charAt(0);
        if (ch == '+') {
            System.out.println("The sum is: " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("The difference is: " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("The multiplication result is: " + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("The division result is: " + (num1 / num2));
        } else if (ch == '%') {
            System.out.println("The remainder result is: " + (num1 % num2));
        } else {
            System.out.println("Abort operation");
        }
    }
}
