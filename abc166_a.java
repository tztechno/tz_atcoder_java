//abc166_a.java
################################
################################
################################
################################
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.math.BigInteger;
import java.util.Comparator;
 
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "ABC";
        if(a.charAt(1) == 'B'){
            ans = "ARC";
        }
        System.out.println(ans);
            } 
    
    public static String yorn (boolean flag){
     //trueならYes、falseならNoを返す
    String answer;
      if(flag){
          answer = "Yes";
      }else{
          answer = "No";
      }
        return answer;
    }
}
################################
 import java.util.*;
 public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String S = sc.next();
         String abc = "ABC";
         if( S.equals(abc)){
        	 System.out.println("ARC");
         }else{
        	 System.out.println("ABC");
         }
     }
 }
################################
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("ABC".equals(new Scanner(System.in).next())?"ARC":"ABC");
  }
}
################################
### never s=="ABC"
import java.util.*;
class Main {
    public static void main(String[] a){
        String s = new Scanner(System.in).next();
        if(s.equals("ABC")){
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }
    }
}
################################
