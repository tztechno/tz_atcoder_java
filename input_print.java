import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = scanner.nextInt();
        }

        System.out.println(N);
        for (int i = 0; i < N; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
