import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int n = s.length();
        if (n < 4) {
            s = String.format("%4s", s).replace(' ', '0');
        }
        System.out.println(s);
    }
}
