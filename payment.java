//abc173_a payment.java
##############################
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    System.out.println((1000-n%1000)%1000);
  }
}
##############################
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 Scanner n = new Scanner(System.in);
 int N= n.nextInt();
    int change=(N%1000==0)?0:1000-(N%1000) ;
    System.out.println(change);
    }
}
##############################
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A=(1000-N%1000)%1000;
    System.out.println(A);
  }
}
##############################
