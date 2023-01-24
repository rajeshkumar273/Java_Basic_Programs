/* Find Number of Digits in a Number


	Example
	Question  1234

	Answer   10

*/


import java.util.Scanner;

class SumDigits {

	public static void main(String args[] ) {

	int n,sum=0,i;

	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter any Number");

	n=sc.nextInt();
		
	
	while(n>0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;


	}


	System.out.println(sum);

}

}