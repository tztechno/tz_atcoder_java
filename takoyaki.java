import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();

        int t = N / X;

        if (N % X == 0) {
            System.out.println(t * T);
        } else {
            System.out.println((t + 1) * T);
        }
    }
}
