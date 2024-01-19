//abc174_a conditioner.java

####################################
####################################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = n >= 30 ? "Yes" : "No";
    System.out.println(ans);
  }
}
####################################
import java.util.*;

public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int X = sc.nextInt();
	    if(X>=30) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
		sc.close();
	}
}
####################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X>=30)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
####################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean judge = (X >= 30);
        int b;
        if (judge)
            b = 1;
        else
            b = 0;
        String[] ANS = {"No", "Yes"};
        System.out.println(ANS[b]);
    }
}
####################################
