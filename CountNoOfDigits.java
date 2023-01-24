/*  Question 123456
    Answer    6 (Count No of Digits in a number)




import java.util.Scanner;

class CountNoOfDigits {

	public static void main(String args[]) {

	
	int n,count=0;

	Scanner sc=new Scanner(System.in);
		

	System.out.println("Please Enter any Number");

	n=sc.nextInt();

	while(n>0)

	{

		n=n/10;
		count++;

	}

	System.out.println("Number of Digits "+count);

}

}
 