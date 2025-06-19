import java.util.*;
class search2ndL{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array : ");
		int n = sc.nextInt();
		int [] arr= new int[n];
		int l,l2;
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextInt();
		}
		l=arr[0];
		for (int i = 0; i<n; i++){
			if (l<arr[i]){
				l=arr[i];
			}
		}
		l2=arr[0];
		for (int i = 0; i<n; i++){
			if (l2<arr[i] && l2<l && arr[i]<l){
				l2=arr[i];
			}
		}
		System.out.printf("\nSecond Largest element = %d",l2);
	}
}