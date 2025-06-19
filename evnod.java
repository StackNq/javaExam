import java.util.*;
class evnod{
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
		int e=0;
		int o=0;
		for (int i = 0; i<n; i++){
			if (arr[i]%2==0){
				e++;
			}
			else{
				o++;
			}
		}
		System.out.printf("\nThe array has:\n %deven elements\n%d odd elements",e,o);
	}
}