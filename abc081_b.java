abc081_b.java
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int bit = 0;
    for(int i = 0;i < N;i++){
      bit |= sc.nextInt();
    }
    System.out.println(Integer.numberOfTrailingZeros(bit));
  }
}
##########################################
[自力AC]
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = scanner.nextInt();
        }
        int[] B = A;
        int flag=1;
        for (int i = 0; i < N*10; ++i) {
            for (int j = 0; j < N; ++j) {
            int bj=B[j];
            if (bj%2==0){
                B[j]=bj/2;               
            } else {
                System.out.print(i);
                flag=0;
                break;                  
            }
            }
        if (flag==0){
            break;          
        }            
        }
    }
}
##########################################
[python]
N=int(input())
A=list(map(int,input().split()))
B=A
for i in range(N*10):
  for j in range(N):
    bj=B[j]
    if bj%2==0:
        B[j]=bj//2
    else:
        print(i)
        exit()
##########################################
