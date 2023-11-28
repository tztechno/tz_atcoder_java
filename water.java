import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int m = N / 5;
        int diff = N % 5;

        int result;
        if (diff <= 2) {
            result = m * 5;
        } else {
            result = (m + 1) * 5;
        }

        System.out.println(result);
    }
}
