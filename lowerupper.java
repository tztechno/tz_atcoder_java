//ABC192_B lowerupper

################################################
import java.util.*;

public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);	    
	    char []S = sc.next().toCharArray();
	    String re = "Yes";
	    for(int i = 0;i<S.length;i++) {
	    	if(i%2==1) {
	    		if(!Character.isUpperCase(S[i])) {
	    			re = "No";
	    			break;
	    		}
	    	}else {
	    		if(Character.isUpperCase(S[i])) {
	    			re = "No";
	    			break;
	    		}
	    	}
	    }
	    System.out.print(re);
		sc.close();
	}
}
################################################
import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner stdIn = new Scanner(System.in);

    String s = stdIn.next();
    int n = s.length();

    for(int i = 0; i < n; i++) {
      if((i % 2 == 0 && s.charAt(i) <= 'Z') || (i % 2 != 0 && 'a' <= s.charAt(i))) {
        System.out.println("No");
        System.exit(0);
      }
    }

    System.out.println("Yes");
  }
}
################################################
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int n = S.length();
        
        for (int i = 0; i < n; ++i) {
            char ch = S.charAt(i);
            
            if ((i % 2 == 0 && !Character.isLowerCase(ch)) || (i % 2 == 1 && !Character.isUpperCase(ch))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
        scanner.close();
    }
}
################################################
