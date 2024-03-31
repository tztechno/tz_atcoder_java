abc068_b.java
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		while(temp <= N /2){
		  temp *=2;
		}
		System.out.println(temp);
  }
}
#########################################
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] array = new int[7];
		array[0] = 1;

		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] * 2;
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (n >= array[i]) {
				System.out.println(array[i]);
				break;
			}
		}

	}
}

#########################################
class Main {
  public static void main(String[] args) {
    int n = new java.util.Scanner(System.in).nextInt();
    int ans = 1;
    for (int i = 0; i < n + 1; ++i) {
      if (Math.pow(2, i) <= n) {
        ans = (int) Math.pow(2, i);
      } else {
        break;
      }
    }
    System.out.println(ans);
  }
}
#########################################
