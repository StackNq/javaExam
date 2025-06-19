import java.util.*;
class duplicates{
	public static int removeDuplicates(int[] arr) {
        int l = arr.length;
        if (l == 0 || l == 1) return l;
        int id = 0;
        for (int i = 0; i < l; i++) {
            boolean f = false;

            for (int j = 0; j < id; j++) {
                if (arr[i] == arr[j]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                arr[id] = arr[i];
                id++;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newSize)));
    }
}	