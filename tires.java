import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a value for S: ");
        String S = scanner.next();

        if (S.length() >= 2 && S.endsWith("er")) {
            System.out.println("er");
        } else {
            System.out.println("ist");
        }

        scanner.close();
    }
}
