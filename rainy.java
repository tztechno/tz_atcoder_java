//abc175_a rainy.java

############################################################
import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int count  = 0;
        int maxCount = 0;
        String s = in.nextLine();
        for(int i = 0; i < 3;i++){
            if(s.charAt(i)=='S'){
                count  = 0;
            }
            else{
                count++;
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
############################################################
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(S.contains("RRR")?3:S.contains("RR")?2:S.contains("R")?1:0);
	}
}
############################################################
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
############################################################

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();

        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.contains("RR")) {
            System.out.println(2);
        } else if (s.contains("R")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}

############################################################
