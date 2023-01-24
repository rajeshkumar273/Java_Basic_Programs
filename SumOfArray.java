import java.util.Scanner;


class SumOfArray {

public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n=sc.nextInt();

int amexTeam[]=new int[n];
System.out.println("Enter " +n +" Elements");
for(int i=0;i<amexTeam.length;i++) {

	amexTeam[i]=sc.nextInt();
}


//Sum of Array
int sum=0;
for(int i=0;i<amexTeam.length;i++) {
	
	
	sum=sum+amexTeam[i];

}

System.out.println("Sum of Given Array "+sum);



// Largest of Array

	int large=amexTeam[0];

	for(int i=1;i<amexTeam.length;i++)

	{
		if(amexTeam[i]>large) 
		{
			large=amexTeam[i];

		}
	}
	
	System.out.println("Largest Element of Given Array "+large);

}

}