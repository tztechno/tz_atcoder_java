abc079_b.java
##########################################
int[] L = new int[N + 1];
for (int i = 2; i <= N; i++) {
##########################################
int64の数値を扱えるようにする
BigInteger[] L = new BigInteger[N + 1];
long []k = new long [N+1];
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
import java.util.Scanner;
public class Main {
    //NarrowRectanglesEasy
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       long[]a=new long[87];
       a[0]=2;
       a[1]=1;
       for (int i = 2; i < 87; i++) {
        a[i]=a[i-1]+a[i-2];
       }
       System.out.println(a[n]);
        sc.close();
    }
}
##########################################
import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    long []k = new long [N+1];
	    k[0] = 2;
	    k[1] = 1;
	    for(int i=2;i<=N;i++) {
	    	k[i] = k[i-2]+k[i-1];
	    }
	    System.out.println(k[N]);
	}
}
##########################################
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger[] L = new BigInteger[N + 1];
        L[0] = BigInteger.valueOf(2);
        L[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= N; i++) {
            L[i] = L[i - 2].add(L[i - 1]);
        }
        System.out.println(L[N]);
        sc.close();
    }
}
##########################################
[部分WA]
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N + 1];
        L[0] = 2;
        L[1] = 1;
        for (int i = 2; i <= N; i++) {
            L[i] = L[i - 2] + L[i - 1];
        }
        System.out.println(L[N]);
        sc.close();
    }
}
##########################################
[python]
N=int(input())
L=[2,1]
for i in range(N-1):
    L+=[L[-2]+L[-1]]
print(L[-1])
##########################################
