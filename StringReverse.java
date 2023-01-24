import java.util.Scanner;


public class StringReverse {

	public static void main(String args[]) {
	

	//1) Using + (String Concatenation) Operator

	 String name,rev;   // name=rajesh 
	
	
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	/*
	int i=name.length()-1;  //5
	rev=""; //hsejar

	while(i>=0) {                       //5 4 3 2 1 0 -1
	
		rev=rev+name.charAt(i);
		i--;

	}

	System.out.println("Reverse String is: "+rev);

	*/



	/*
	// 2) Using Character Array 

	rev="";

	char a[]=name.toCharArray();
	
	int len=a.length;
	
	for(int i =len-1;i>=0;i--) {
		
		rev=rev+a[i];

	}
	System.out.println("Reverse String is: "+rev);

	*/

	StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
	}

}



		
	

	