abc077_b.java
##############################################
##############################################
##############################################
##############################################
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       	var n = sc.nextInt();
		for (int i = 1;; i++){
        	if (i*i > n){
            	System.out.println((i-1)*(i-1));
				return;
            }
        }
    }
}
##############################################
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    while((i+1)*(i+1) <= n)
      i++;
    System.out.println(i*i);
  }
}
##############################################
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (int) Math.sqrt(n);
        System.out.println(m * m);
    }
}
##############################################
[python]
import math
n=int(input())
m=int(math.sqrt(n))
print(m**2)
