import java.util.Scanner;

class MathFunctions {

	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Value: ");
	int x=sc.nextInt();
	System.out.println("Enter second Value: ");
	int y=sc.nextInt();
	
	System.out.println("Max Value: "+Math.max(x,y));
	System.out.println("Min Value: "+Math.min(x,y));
	System.out.println("Power "+Math.pow(2,3));
	System.out.println("Square Root of x: "+Math.sqrt(x));
	System.out.println("Square Root of y: "+Math.sqrt(y));

	//The Math.abs(x) method returns the absolute (positive) value of x:

	System.out.println("Math abs method: "+Math.abs(-4.7));
	
	System.out.println("Random Number From 0.0 to 0.1: "+Math.random()); 
	//To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:

	 int randomNum = (int)(Math.random() * 101);  // 0 to 100
   	 System.out.println("Random Number From 0 to 100: "+randomNum);


	System.out.println("Floor Function: "+Math.floor(4.9));
	System.out.println("ceil Function: "+Math.ceil(4.1));
	System.out.println("ROUND  Function at 4.1: "+Math.round(4.1));
	System.out.println("ROUND  Function at 4.4: "+Math.round(4.4));
	System.out.println("ROUND  Function at 4.5: "+Math.round(4.5));
	System.out.println("ROUND  Function at 4.6: "+Math.round(4.6));
	System.out.println("ROUND  Function at 4.7: "+Math.round(4.7));
}

}

