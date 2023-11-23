import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String S;

            // Check if the next input is a string
            if (sc.hasNext()) {
                S = sc.next();

                String[] name = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                int[] days = {5, 4, 3, 2, 1};

                Map<String, Integer> mapping = new HashMap<>();
                for (int i = 0; i < name.length; i++) {
                    mapping.put(name[i], days[i]);
                }

                // Check if S is a valid day
                if (mapping.containsKey(S)) {
                    System.out.println(mapping.get(S));
                } else {
                    System.out.println("Invalid input for day");
                }
            } else {
                System.out.println("No input provided");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
