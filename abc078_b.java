abc078_b.java
#################################
#################################
#################################
import java.io.*;

public class Main {

    static Read r = new Read();
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int x = r.nextInt();
        int y = r.nextInt();
        int z = r.nextInt();

        System.out.printf("%d%n",(x - z) / (z + y));
    }

    private static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }

        public String readLine() throws Exception {    //	不推荐使用
            st.nextToken();
            return st.sval;
        }
    }
}
#################################
import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
	    int Z = sc.nextInt();
	    System.out.println((X-Z)/(Y+Z));
	}
}
#################################
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        System.out.println((X-Z)/(Y+Z));
    }
}
#################################
[python]
X,Y,Z=map(int,input().split())
print((X-Z)//(Y+Z))
#################################
