import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        String[] inputValsStr = inputStr.split(" ");
        int[] inputVals = new int[inputValsStr.length];

        for (int i = 0; i < inputValsStr.length; i++) {
            inputVals[i] = Integer.parseInt(inputValsStr[i]);
        }

        if (inputVals.length == 2) {
            int A = inputVals[0];
            int B = inputVals[1];

            char[] ADigits = Integer.toString(A).toCharArray();
            char[] BDigits = Integer.toString(B).toCharArray();

            int sumADigits = 0;
            for (char digit : ADigits) {
                sumADigits += Character.getNumericValue(digit);
            }

            int sumBDigits = 0;
            for (char digit : BDigits) {
                sumBDigits += Character.getNumericValue(digit);
            }

            int ansValue = Math.max(sumADigits, sumBDigits);

            System.out.println(ansValue);
        } else {
            System.out.println("Invalid input. Please enter two space-separated numbers.");
        }
    }
}

##############################################

import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);	
		String A = input.next();
		String B = input.next();
		int a = 0;
		int b = 0;		
		for (int i = 0; i < 3; i++) {
			a += (A.charAt(i) - '0');
			b += (B.charAt(i) - '0');
		}		
		System.out.println(a >= b ? a:b);
	}
}
