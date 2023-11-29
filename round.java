import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();

        int a = (int) (X * 10);

        if (a % 10 >= 5) {
            System.out.println((int) X + 1);
        } else if (a % 10 <= 4) {
            System.out.println((int) X);
        }

        scanner.close();
    }
}
