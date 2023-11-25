import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for (int i = 0; i < 256; i++) {
            if ((A ^ i) == B) {
                System.out.println(i);
                break;
            }
        }
    }
}
