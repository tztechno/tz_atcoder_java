import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();

        if (N <= 125) {
            System.out.println(4);
        } else if (N <= 211) {
            System.out.println(6);
        } else {
            System.out.println(8);
        }

        scanner.close();
    }
}
