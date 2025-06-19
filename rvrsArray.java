import java.util.*;
class rvrsArray{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array : ");
		int n = sc.nextInt();
		int [] arr= new int[n];
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array = "+Arrays.toString(arr));
		int l=0,r=n-1;
		while(l<r){
			int tem=arr[l];
			arr[l]=arr[r];
			arr[r]=tem;
			l++;
			r--;
		}
		System.out.println("Reversed Array = "+Arrays.toString(arr));
	}
}