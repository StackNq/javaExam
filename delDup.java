import java.util.Scanner;

public class delDup {
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

        String[] unq = new String[n]; 
        int c = 0;

        for (int i = 0; i < n; i++) {
            boolean f = false;
            for (int j = 0; j < c; j++) {
                if (arr[i].equals(unq[j])) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                unq[c] = arr[i];
                c++;
            }
        }

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < c; i++) {
            System.out.print(unq[i]+" ");
        }
    }
}
