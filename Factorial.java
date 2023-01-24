import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
	int i,n;
	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int fact=1;
	for(i=1;i<=n;i++) {
		fact=fact*i;
	
	}
	System.out.println("Factorial of given Number:"+fact);

	}
}