import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        if (N <= 125) {
            System.out.println(4);
        } else if (N <= 211) {
            System.out.println(6);
        } else {
            System.out.println(8);
        }
        scanner.close();
    }
}

################################################

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new  Scanner(System.in);
         int N = sc.nextInt();
         System.out.println(N <= 125 ? 4 : N <= 211 ? 6 : 8);
    }
}
