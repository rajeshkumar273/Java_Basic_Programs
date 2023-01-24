import java.util.Scanner;

class StringPalindrome {

	public static void main(String args[]) {
	
	String orgName,revName="";
	
	System.out.println("Enter Any String: ");

	Scanner sc=new Scanner(System.in);
	
	orgName=sc.next();
	
	int len=orgName.length();
	
	/*
	int i=len-1;
	
	while(i>=0) {
		
		revName=revName+orgName.charAt(i);
		i--;	
	}
	
	*/

	
	for(int i=len-1;i>=0;i--) {


		revName=revName+orgName.charAt(i);
	}

	if(orgName.equals(revName))	 {
		System.out.println("Palindrome String");
	}
	else 

		System.out.println("Not Palindrome Strin");



		
	
	
	



}

}

