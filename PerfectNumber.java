import java.util.Scanner;

class PerfectNumber {

	public static void main(String args[]) {
	
	int n,sum=0;

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Any Number: ");

	n=sc.nextInt();
	
	
	for(int i=1;i<n;i++) 
	{

		if(n%i==0) {
			sum=sum+i;

		}

	}

	if(sum==n) 
		System.out.println("Given Number is Perfect Number");
	else

		System.out.println("Not a perfect Number");
	
}
}

	