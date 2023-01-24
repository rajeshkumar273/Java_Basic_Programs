import java.util.Scanner;

class Armstrong {

	public static void main(String args[]) {

	int n,r,sum=0;

	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	int temp=n;
	while(n>0) {
	
		r=n%10;
		sum=(r*r*r)+sum;
		n=n/10;
		
	}
	
	if(temp==sum)
		System.out.println(sum +" is Armstrong Number");
	else
		System.out.println(temp + " is not Armstrong Number");

}

}

	
