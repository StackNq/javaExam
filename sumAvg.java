import java.util.*;
class sumAvg{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array : ");
		int n = sc.nextInt();
		int [] arr= new int[n];
		int sum =0;
		for (int i = 0; i<n; i++){
			System.out.printf("\nEnter value of element %d: ",i+1);
			arr[i] = sc.nextInt();
			sum = sum + arr[i]; 
		}
		float avg = (float)sum/n;
		System.out.printf("The sum of all elements = %d\naverage = %.2f",sum,avg);
	}
}