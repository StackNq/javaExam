import java.util.*;
class merge{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the 1st array : ");
		int n = sc.nextInt();
		int [] arr= new int[n];
		System.out.println("For first array : ");
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter number of elements in the 2nd array : ");
		int n1 = sc.nextInt();
		int [] arr1= new int[n1];
		System.out.println("For second array : ");
		for (int i = 0; i<n1; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr1[i] = sc.nextInt();
		}
		
		int[] mArr= Arrays.copyOf(arr, n1 + n);
        System.arraycopy(arr1, 0, mArr, n, n1);

        System.out.print("\nMerged array: "+Arrays.toString(mArr));
	}
}