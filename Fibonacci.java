import java.util.Scanner;

class Fibonacci {

	public static void main(String args[]) {

		//int n,first_term=0,second_term=1;


		int n, firstTerm=0,secondTerm=1;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of terms");
		
		n=sc.nextInt();

		//Method-1
	
		/*for(int i=1;i<=n;i++)

		{
			System.out.println(first_term + ",");
		

			//compute the next term

			int nextTerm=first_term+second_term;
			first_term=second_term;
			second_term=nextTerm;


		}

		*/


		//Method-2

		System.out.print(firstTerm+ "\t"+secondTerm+"\t"); 

		for(int i=2;i<n; i++) 
		
		{
			int nextTerm=firstTerm+secondTerm;
			System.out.print(nextTerm + "\t");
			
			firstTerm=secondTerm;
			secondTerm=nextTerm;


		}
		
}

}
	
	