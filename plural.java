//ABC179_A
//plural


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim(); 

        if (S.endsWith("s")) {
            System.out.println(S + "es");
        } else {
            System.out.println(S + "s");
        }

        scanner.close();
    }
}
