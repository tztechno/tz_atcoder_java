abc070_b.java
##############################
##############################
##############################
##############################
##############################
##############################
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(b < c || d < a){System.out.println(0);}
        else if(a <= c && d <= b){
            System.out.println(d - c);
        }else if(a <= c && b <= d){
            System.out.println(b - c);
        }else if(c <= a && b <= d){
            System.out.println(b - a);
        }else {
            System.out.println(d - a);
        }
        
    }
    
}

##############################
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B, D) - Math.max(A, C);
        System.out.println(Math.max(ans, 0));
    }
}

##############################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int t = Math.max(Math.min(b,d)-Math.max(a,c),0);
        System.out.println(t);
        }
    }
##############################
