import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your char");
        char ch = scanner.next().charAt(0);         //scanner.next().charArt(0) = scanner.nextChar() as the last one does not exist
        if (!Character.isUpperCase(ch)) {
            System.out.println("NO");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("YES");
        }
    }
}
