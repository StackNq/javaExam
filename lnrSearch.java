import java.util.*;
class lnrSearch{
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
		System.out.print("Enter the element you want to search : ");
		int e = sc.nextInt();
		int f=-1;
		for (int i = 0; i<n; i++){
			if (e ==arr[i]){
				f=i;
				break;
			}
		}
		if (f!=-1){
			System.out.printf("\nThe element was found at index no. = %d",f);
		}
		else{
			System.out.printf("\nThe element does nto exist in the array");
		}
	}
}