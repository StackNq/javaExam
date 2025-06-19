import java.util.Scanner;

class Sumby{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n=sc.nextInt();
		double sum=0.0;
		terms tno[]=new terms[n];
		for (int i=1; i<=n; i++){
			tno[i-1]=new terms(i);
			sum= sum+tno[i-1].ret();
		}
		System.out.print("The value of the series till "+n+" is ="+sum);
	}
}

class terms{
	double x;
	terms(int a){
		x=(double) 1/a;
	}
	double ret(){
		return x;
	}
}
