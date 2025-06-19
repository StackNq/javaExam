import java.util.*;
class bblSort{
	public static void sort(int [] ar){
		int n=ar.length;
		for (int i=0;i<n;i++){
			int f=0;
			for(int j=0;j<n-1-i;j++){
				if (ar[j+1]<ar[j]){
					int tem=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=tem;
					f=1;
				}
			}
			if (f==0){
				break;
			}
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements : ");
		int n = sc.nextInt();
		System.out.printf("\nEnter %d elements : \n",n);
		int [] ar= new int[n];
		for(int i=0; i<n; i++){
			ar[i]=sc.nextInt();
		}
		sort(ar);
		System.out.printf("\nSorted Array :");
		for (int i:ar){
			System.out.printf(" "+i);
		}
	}
}