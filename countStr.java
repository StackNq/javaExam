import java.util.*;

class countStr{
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

        System.out.print("Enter the starting character to search for: ");
        char ch = sc.next().charAt(0);
        int c = 0;
        for (String str : arr) {
            if (!str.isEmpty() && str.charAt(0) == ch) {
                c++;
            }
        }

        System.out.println("\nStrings starting with '" + ch + "': " + c);
    }
}