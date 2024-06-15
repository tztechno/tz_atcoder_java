abc080_b.java
##########################################
数字の文字列Xをバラバラにして、各文字数字をintに変える
int M = 0;
for (int i = 0; i < X.length(); i++) {
    char c = X.charAt(i); // 文字列Xから1文字取得
    int digit = Character.getNumericValue(c); // 文字を数値に変換
    M += digit; // 合計に加算
}
##########################################
string"123"をint 123にしたい
int number = Integer.parseInt(str);
##########################################
再帰的なメソッド sumDig 
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.print(sumDig(n));
  }
  public static int sumDig(int n){
    if(n<10)
      return n;
    return n%10+sumDig(n/10);
  }
}
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if(n%sumDig(n)==0)
      System.out.print("Yes");
      else System.out.print("No");
  }
  public static int sumDig(int n){
    if(n<10)
      return n;
    return n%10+sumDig(n/10);
  }
}
##########################################
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        int M = 0;
        for (int i = 0; i < X.length(); i++) {
            char c = X.charAt(i); 
            int digit = Character.getNumericValue(c); 
            M += digit; 
        }
        int Y = Integer.parseInt(X);
        if (Y%M==0){
         System.out.println("Yes");    
        } else {
         System.out.println("No");    
        }      
    }
}
##########################################
[python]
X=str(input())
M=0
for x in list(X):
  M+=int(x)
if int(X)%M==0:
  print('Yes')
else:
  print('No')
##########################################
