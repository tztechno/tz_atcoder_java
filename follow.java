//ABC182_A
//Follow
//input= 200 300

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int XB = 2*A+100;
        
        System.out.println(XB-B);
    }
}
