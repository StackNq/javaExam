import java.util.Scanner;

class StudentOps{
	public static void main(String [] args){
		Student [] s= new Student[10]; 
		for (int i=1; i<=10; i++){
			System.out.println("For Roll no. "+i+" :");
			s[i-1]=new Student();
		}
		for (int i=1; i<=10; i++){
			System.out.println("Roll no. = "+i+"\tName -> "+s[i-1].name);
			System.out.printf("Total CA1 = %.2f\tTotal PCA1 = %.2f\tTotal = %.2f\tPercentage = %.2f%%\n", s[i-1].totalCA(), s[i-1].totalPCA(), s[i-1].totalAll(), s[i-1].percent());
		}
	}
}

class Student{                                                                                                                   
	String name;
	int roll;
	double ca1,ca2,ca3,ca4,pca1,pca2;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student name : ");
		name=sc.nextLine();
		System.out.print("Enter the marks of \nCA1 = ");
		ca1=sc.nextDouble();
		System.out.print("CA2 = ");
		ca2=sc.nextDouble();
		System.out.print("CA3 = ");
		ca3=sc.nextDouble();
		System.out.print("CA4 = ");
		ca4=sc.nextDouble();
		System.out.print("PCA1 = ");
		pca1=sc.nextDouble();
		System.out.print("PCA2 = ");
		pca2=sc.nextDouble();
	}
	double totalCA(){
		return ca1+ca2+ca3+ca4;
	}
	double totalPCA(){
		return pca1+pca2;
	}
	double totalAll(){
		return (this.totalCA() + this.totalPCA());
	}
	double percent(){
		return (this.totalCA() + this.totalPCA())*100/180;
	}
}