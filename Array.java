import java.util.Scanner;

class Array {

	public static void main(String args[]) {
	
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Size");
	n=sc.nextInt();

	//int amexTeam[]=new int[n];
	String amexTeam[]=new String[n];

	/*
	amexTeam[0]=10;
	amexTeam[1]=20;
	amexTeam[2]=30;
	amexTeam[3]=40;
	amexTeam[4]=50;
	*/

	

	//int amexTeam[]={10,20,30,40,50}; //declaration, instantiation and initialization 

	
	System.out.println("Enter "+n + " Elements");

	for(int i=0;i<amexTeam.length; i++) 

	{

		//amexTeam[i]=sc.nextInt();
		amexTeam[i]=sc.next();
	}


	for(int i=0;i<amexTeam.length;i++) //length is the property of array  

	 { 


		System.out.println("Array "+i + " element is " +amexTeam[i]+ "\t");

		//System.out.println(amexTeam.length);

	}

	


	
	/* 

	//printing array using for-each loop  
	for(int i:amexTeam)  
	System.out.println(i);  

	*/

}

}


	

	
