import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String[] name = {"ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"};

        if (Arrays.asList(name).contains(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
