import java.util.*;

class strConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[n];
		System.out.println("Enter " + n + " strings:");
        StringBuilder nw = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            nw.append(arr[i]);
			nw.append(" ");
        }
        System.out.println("\nConcatenated String: " + nw.toString());
    }
}
