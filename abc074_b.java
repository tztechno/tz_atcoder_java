abc074_b.java
#######################################
#######################################
#######################################
#######################################
#######################################
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N:ボールの数
        int N = sc.nextInt();
        //ロボットの位置
        int K = sc.nextInt();
        //Xi。
        int[] P = new int[N];
        int min = 0;
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            //タイプAの場合
            int A = Math.abs(0-P[i])*2;
            int B = Math.abs(K-P[i])*2;
            min = min+Math.min(A,B);
        }
        System.out.println(min);
    }
}
#######################################
import java.util.*;
class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0;i<n;i++){
		    int d1=a[i]*2;
		    int d2=(k-a[i])*2;
		    cnt+=Math.min(d1,d2);
		}
		System.out.println(cnt);
	}
}
#######################################
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int s = 0;

        for (int i = 0; i < n; ++i) {       
            int x = scanner.nextInt();
            s+=Math.min(x,k-x)*2; 
        }
        
        System.out.println(s);
        scanner.close();
    }
}
#######################################
