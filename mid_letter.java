import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int n = input.length() / 2;
        char ans = input.charAt(n);

        System.out.println(ans);

        scanner.close();
    }
}
