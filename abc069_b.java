abc069_b.java
#########################################
int n = s.length();
String ans = "" + s.charAt(0) + (n-2) + s.charAt(n-1);
#########################################
#########################################
#########################################
#########################################
#########################################
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1));
	}
}
#########################################
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		bw.write(string.charAt(0)+""+(string.length()-2)+string.charAt(string.length()-1));
		
		bw.close();
	} // end of main()
} // end of Main class
#########################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        String ans = "" + s.charAt(0) + (n-2) + s.charAt(n-1);
        System.out.println(ans);
    }
}
#########################################
