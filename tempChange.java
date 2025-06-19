import java.util.Scanner;
class tempChange{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your temperature reading : ");
		double temp= sc.nextDouble();
		System.out.println("Choices \n1 for changing to Fahrehite\n2 for changing to Celcius");
		System.out.print("Eneter your choice : ");
		int ch=sc.nextInt();
		if (ch==1){
			float tf =(float)(((9/5)*temp)+32);
			System.out.printf("in Fahrehite = %.2f °F",tf);
		}
		else if (ch==2){
			float tc =(float)((temp-32)*5)/9;
			System.out.printf("in Celcius = %.2f °C",tc);
		}
		else {
			System.out.println("Wrong choice");
		}
	}
}