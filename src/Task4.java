import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number");
        double num3 = scanner.nextDouble();
        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
