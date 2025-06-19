import java.util.*;
class shortLongest{
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
		String l=arr[0];
		String s=arr[0];
		for (int i = 0; i<n; i++){
			if (l.length() < arr[i].length()){
				l=arr[i];
			}
			if (s.length() > arr[i].length()){
				s=arr[i];
			}
		}
		System.out.println("\nShortest string : "+s+"\nLongest string : "+l);
	}
}