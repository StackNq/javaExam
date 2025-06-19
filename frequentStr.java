import java.util.*;

public class frequentStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String mostFq = arr[0];
        int mC = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    c++;
                }
            }
            if (c > mC) {
                mC = c;
                mostFq = arr[i];
            }
        }
        System.out.println("\nMost Frequent String: " + mostFq+" ("+mC+" times)");
    }
}