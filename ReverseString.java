import java.util.Scanner;

class ReverseString {
	public static void main(String [] args) {

	String rev, name;

	Scanner sc =new Scanner(System.in);
	
	name=sc.next();

	rev="";
	int i=name.len-1;
	while(i>=0) {
	
		rev=rev+name(i);
		i--;
	}
		
	System.out.println("Given String is "+name);
	System.out.println("Reverse String is "+rev);


	
}

}