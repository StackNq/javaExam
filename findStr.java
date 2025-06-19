import java.util.*;
class fintStr{
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
		System.out.print("Elements string you want to search : ");
		String s = sc.nextLine();
		int f=-1;
		for (int i = 0; i<n; i++){
			if (arr[i].equals(s)){
				f=i;
				break;
			}
		}
		if (f!=-1){
			System.out.println("\n string was found at index no. =  "+f);
		}
		else{
			System.out.println("\nstring was not found in the array ");
		}
		
	}
}