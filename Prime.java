import java.util.Scanner;

class Prime {
 public static void main(String args[]) {
	int n,count=0,i;
	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		if (n%i==0) {
			count++;
		}
	}

if(count==2) {
	System.out.println("Prime");
}
else{
	System.out.println("Non Prime");

	}
}
}