import java.util.Scanner;

class Array2D {

	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter row Size");
	
	int row=sc.nextInt();
	
	System.out.println("Enter Column Size");
	
	int column=sc.nextInt();
	
	int amexTeam[][]=new int[row][column];

	System.out.println("Enter "+row*column + " Elements");

	for(int i=0;i<amexTeam.length;i++) {

		for(int j=0; j<amexTeam.length;j++) {


			amexTeam[i][j]=sc.nextInt();

			}
	}

	
	
	
	System.out.println("Given Elements: ");
	for(int i=0;i<amexTeam.length;i++) {

		for(int j=0; j<amexTeam.length;j++) {

			System.out.print(amexTeam[i][j]+" ");

		}

			System.out.println();
	}

	

}

}
