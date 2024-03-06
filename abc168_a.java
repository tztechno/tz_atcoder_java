//abc168_a.java
################################
switch構文
    switch(n%10) {
      case 0:
      case 1:
      case 6:
      case 8:
        ans = "pon";
        break;
################################
################################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() % 10;
    String ans = "bon";
    if (n == 3) {
      ans = "bon";
    } else if (n == 0 || n == 1 || n == 6 || n == 8) {
      ans = "pon";
    } else {
      ans = "hon";
    }
    System.out.println(ans);
  }
}
################################
import java.util.*;

class Main {
    public static void main(String[] a){
        int n = new Scanner(System.in).nextInt()%10;
        System.out.printf("%con"
            ,new char[]{'p','p','h','b','h','h','p','h','p','h'}[n]);
    }
}
################################
class Main {
  public static void main(String[] args) {
    int n = new java.util.Scanner(System.in).nextInt();
    String ans = "hon";
    switch(n%10) {
      case 0:
      case 1:
      case 6:
      case 8:
        ans = "pon";
        break;
      case 3:
        ans = "bon";
        break;
      default:
        break;
    }
    System.out.println(ans);
  }
}
################################
import java.util.*;

class Main {
    public static void main(String[] a){
        String s = new Scanner(System.in).next();
        String c = Character.toString(s.charAt(s.length()-1));
        if("3".contains(c)){
            System.out.println("bon");
        }else if("0168".contains(c)){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}
################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if ("24579".contains(n.substring(n.length()-1))) {
        	System.out.println("hon");
        } else if ("0168".contains(n.substring(n.length()-1))) {
        	System.out.println("pon");
        } else {
        	System.out.println("bon");
        }
    }
}
################################
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int a = Character.getNumericValue(input.charAt(input.length() - 1));
        if (Arrays.asList(2, 4, 5, 7, 9).contains(a)) {
            System.out.print("hon");
        } else if (Arrays.asList(0, 1, 6, 8).contains(a)) {
            System.out.print("pon");
        } else {
            System.out.print("bon");
        }
    }
}
################################
