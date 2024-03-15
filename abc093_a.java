//abc093_a.java
####################################
####################################
####################################
####################################
####################################
####################################
####################################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Character> set = new HashSet<Character>();
    String s = sc.next();
    for (char c : s.toCharArray()) {
      set.add(c);
    }
    String ans = "No";
    if (set.size() == 3) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}
####################################
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.charAt(0)!=s.charAt(1)&&s.charAt(1)!=s.charAt(2)&&s.charAt(0)!=s.charAt(2)?"Yes":"No");
		sc.close();
	}
}
####################################
import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        if(s.contains("a") && s.contains("b") && s.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
####################################
