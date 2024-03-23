abc096_a.java
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		if (b >= a){
			result = a;
		} else {
			result = (a-1);
		System.out.println(result);
	}
}
#########################################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {
      a--;
    }
    System.out.println(a);
  }
}

#########################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A<=B) {
            System.out.println(A);
        } else {
            System.out.println(A-1);
        }
    }
}
#########################################
