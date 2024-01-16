//abc175_a rainy.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        int[] DP = {0, 0, 0, 0}; // Correct array initialization syntax
        for (int i = 0; i < 3; i++) {
            if (A.charAt(i) == 'R') {
                DP[i + 1] = DP[i] + 1; // Corrected the semicolon at the end
            }
        }
        System.out.println(max(DP));
    }

    // Function to find the maximum value in an array
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
