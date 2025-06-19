import java.util.Scanner;

public class strCase{
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
        System.out.print("\nUppercase Strings:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].toUpperCase()+" ");
        }
        System.out.print("\nLowercase Strings:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].toLowerCase()+" ");
        }
    }
}
