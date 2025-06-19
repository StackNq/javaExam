import java.util.*;
class search{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array : ");
		int n = sc.nextInt();
		int [] arr= new int[n];
		int l,s;
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextInt();
		}
		l=arr[0];
		s=arr[0];
		for (int i = 0; i<n; i++){
			if (l<arr[i]){
				l=arr[i];
			}
			else if (s>arr[i]){
				s=arr[i];
			}
		}
		System.out.printf("\nLargest element = %d\nSmallest element = %d",l,s);
	}
}