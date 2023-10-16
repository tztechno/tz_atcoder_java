import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			for (int i = 0; i < n - 1; i++) {
				if (sc.nextInt() != a) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}

	}
}
