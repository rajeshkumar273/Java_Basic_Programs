import java.util.Scanner;
class SwapTwoNumbers {
	public static void main(String[] args)
	{
		int a, b;
		System.out.println("Enter any two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt(); //a=10
		b=sc.nextInt(); // b=20
		System.out.println("Before Swapping:");
		System.out.println(a);
		System.out.println(b);
		
		/*Logic 1
		a=a+b; //30	
		b=a-b; //10
		a=a-b; //20

		*/


		/*Logic 2
	
		b=a+b; //30	
		a=b-a; //10
		b=b-a; //20
		*/

		/*Logic 3
	
		a=a^b;
		b=a^b;
		a=a^b;
	
		*/
	

		/*Logic 4
		
		int temp;
		temp=a;
		a=b;
		b=temp;
	
		*/

		/*Logic 5

		a=a*b;  // 10*20=200
		b=a/b; // 200/20=10
		a=a/b; // 200/10=20
	
		*/


		//Logic 6 single statement 
		// a=10 b=20
		
		b=a+b - (a=b); 
	
		

		System.out.println("After Swapping:");
		System.out.println(a);
		System.out.println(b);
	}

}

