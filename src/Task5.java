import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        a = num1/10;
        b = num1%10;
        c = num2/10;
        d = num2%10;
        if ((a + b) == (c + d)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
