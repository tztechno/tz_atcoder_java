abc073_b.java
#######################################
#######################################
#######################################
#######################################
#######################################
import java.util.*;

public class Main{
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        final int N=sc.nextInt();
        int ans=0;
        for(int i=0;i<N;i++)ans+=-sc.nextInt()+(sc.nextInt()+1);
        System.out.println(ans);
    }
}

#######################################
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
    for (int i = 1; i <= n; i++){
      int start = sc.nextInt();
      int end = sc.nextInt();
      count += end - start + 1;
    }
    
    System.out.println(count);
	}
}
#######################################
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;

        for (int i = 0; i < n; ++i) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            t += r - l + 1;
        }
        
        System.out.println(t);
        scanner.close();
    }
}
#######################################
