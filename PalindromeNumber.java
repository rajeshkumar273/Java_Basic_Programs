import java.util.Scanner;

class PalindromeNumber {
	public static void main(String args[]) {

	int n,r,sum=0;

	System.out.println("Enter any number");
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	int temp=n;
	
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}

	if(temp==sum)
		System.out.println("Given number is palindrome "+sum);
	else
		System.out.println(temp +" Not a Palindrome Number");

}

}
