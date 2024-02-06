//abc170_a variables.java
#####################################
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 5; i++) {
			int x = input.nextInt();
			if(x == 0)
				System.out.println(i);
		}
	}
}
#####################################
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int res = 0;
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++){
            if(a[i] == 0){
                res = i+1;
                break;
            }
        }
        System.out.println(res);
    }
}
#####################################
import java.util.*;
public class Main
{
    public static void main(String args[]){
        int res = 0;
        int[] variables= new int[5];
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 5;i++){
            variables[i] = entrada.nextInt();
            if(variables[i]== 0){
            res = i + 1;
            }
        }
        System.out.println(res);
    }
}
#####################################
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int[] X = new int[5];
    for (int i=0; i<5; i++) {      
        X[i] = stdIn.nextInt();
    }
    for (int i=0; i<5; i++) {  
      if (X[i]==0) {
        System.out.println(i+1);                 
      }   
    }      
  }
}
#####################################
