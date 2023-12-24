#ABC329_B
#next

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = scanner.nextInt();
        }
        
 // Remove duplicates using a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }
        
// Convert the set back to an array and sort it
        Integer[] uniqueArray = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArray);
        
        System.out.println(uniqueArray[uniqueArray.length - 2]);
        } 
    }
