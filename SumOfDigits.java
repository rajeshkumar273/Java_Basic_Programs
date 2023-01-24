import java.util.Scanner;

class SumOfDigits {

	public static void main(String [] args ) {

		int sum=0,n,i;

		System.out.println(" Enter any number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			sum+=i;
			
		}	
			System.out.println(sum);

}
}
