import java.util.*;
class strShow{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array : ");
		int n = sc.nextInt();
		sc.nextLine();
		String [] arr= new String[n];
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextLine();
		}
		System.out.println("Elements of your string : ");
		for (int i = 0; i<n; i++){
			System.out.println(arr[i]);
		}
		
	}
}