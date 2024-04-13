abc072_b.java
######################################
a += s.charAt(i);
######################################
######################################
######################################
######################################
######################################
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = "";

        if (s.length() % 2 == 1) {

            for (int i = 0; i <= (s.length() + 2) / 2 - 1; i++) {
                ss += s.substring(2 * i, 2 * i + 1);
            }
        } else {
            for (int i = 0; i <= s.length() / 2 - 1; i++) {
                ss += s.substring(2 * i, 2 * i + 1);
            }

        }

        System.out.println(ss);

    }
}
######################################
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] ary = str.split("");
    
    for(int i=0; i<ary.length; i+=2){
      System.out.print(ary[i]);
    }
  }
}
######################################
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.print(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
######################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String a = "";
        for(int i = 0; i < s.length(); i += 2) {
            a += s.charAt(i);
        }
        System.out.println(a);
    }
}
######################################
