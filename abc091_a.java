//abc091_a.java
################################
################################
################################
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b >= c){
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}
################################
import java.util.*;

public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    System.out.println(A+B>=C?"Yes":"No");
	}
}
################################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String ans = "No";
    if (a + b >= c) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}
################################
import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String wk = scan.nextLine();
		int a = Integer.valueOf(wk.split(" ")[0]);
		int b = Integer.valueOf(wk.split(" ")[1]);
		int c = Integer.valueOf(wk.split(" ")[2]);
        
        System.out.println(a+b>=c?"Yes":"No");
    }
}
################################
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      	int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

      	if (a + b >= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
################################
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[3];
        for (int i = 0; i < 3; ++i) {
            A[i] = scanner.nextInt();
        }

        if (A[0]+A[1]>=A[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A+B>=C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
################################
