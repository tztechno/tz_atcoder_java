abc108_a.java
##############################################
##############################################
##############################################
##############################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        if(x%2==0)
         System.out.println((x/2)*(x/2));
         else
         System.out.println(((x-1)/2)*((x-1)/2+1));
    }
}
##############################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n/2;
        int r=n-k;
        System.out.println(r*k);
        sc.close();
    }
}

##############################################
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int ans = (n/2)*((n+1)/2);
        System.out.println(ans);
    }
}
##############################################
[python]
N=int(input())
print((N//2)*((N+1)//2))
##############################################
