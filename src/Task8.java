import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your char");
        char ch = scanner.next().charAt(0);
        if (Character.isDigit(ch) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
