import java.util.Scanner;

class ReverseNumber {

public static void main(String [] args) {

	int n,i,reverse=0,r;

	System.out.println("Enter any  two digit number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	System.out.println("Given Number is "+n);
	int temp=n;
	while(n>0)
	{
		r=n%10;
		reverse =(reverse*10)+r;
		n=n/10;
		
	}
	
	System.out.println("Reverse of given number "+reverse);	
	
}
}
