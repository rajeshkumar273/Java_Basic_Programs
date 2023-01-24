import java.util.Scanner;

class StrongNumber {

	public static void main(String args[]) {

	int n;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number");
	n=sc.nextInt();
							
	int sum=0;
	int temp=n;
	while(n>0) {
	
		int r=n%10;
		int fact=1;
		for(int i=r;i>=1;i--) {
	
			fact=fact*i;

			System.out.println
		}
		sum=sum+fact;
	
	n=n/10;
	}
	
	if(temp==sum) 

		System.out.println("Given number is StrongNumber");

	else

		System.out.println("Not a Strong Number");

}

}
	
	


	