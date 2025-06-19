import java.util.*;
class HumanTime{
	public static void main(String [] args){
		System.out.println("For person 1 : ");
		MyTime p1 = new MyTime();
		System.out.println("For person 2 : ");
		MyTime p2 = new MyTime();
		int h1,m1,h,m=0,s;
		
		h= p1.hh + p2.hh;
		m= p1.mm + p2.mm;
		
		if((p1.ss + p2.ss)>=60){
			m1=(p1.ss + p2.ss)/60;
			m= m+m1;
			s=(p1.ss + p2.ss)-(m1*60);
		}
		else{
			s=p1.ss + p2.ss;
		}
		
		if (m >=60){
			h1 = m/60;
			h=h+h1;
			m= m -(h1*60);
		}
		
		System.out.printf("\nTime: %d hours %d minutes %d seconds",h,m,s);
	}
}

class MyTime{
	int hh,mm,ss;
	MyTime(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hour : ");
		hh=sc.nextInt();
		System.out.print("Enter Minute : ");
		mm=sc.nextInt();
		System.out.print("Enter Seconds : ");
		ss=sc.nextInt();
	}
}