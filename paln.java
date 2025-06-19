import java.util.*;
class paln{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter string : ");
		String s=sc.nextLine();
		String rev="";
		for ( int i=s.length()-1;i>=0;i--){
			rev+= s.charAt(i);
		}
		
		if (s.equals(rev)){
			System.out.print(s+" is a palindrome");
		}
		else{
			System.out.print(s+" is not a palindrome");
		}
	}
}