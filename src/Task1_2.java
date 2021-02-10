import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input David's weight ");
        double david = scanner.nextDouble();
        System.out.println("Input Uzi's weight ");
        double uzi = scanner.nextDouble();
        if (david > uzi) {
            System.out.println("Remainder is: " + (david - uzi));
        } else if (uzi > david) {
            System.out.println("Remainder is: " + (uzi - david));
        } else {
            System.out.println("Remainder is: " + 0);
        }
    }
}
