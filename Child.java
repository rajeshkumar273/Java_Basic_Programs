import java.util.Scanner;

class Parent {

	public static void main(String args[]) {
	
	String surname;
	System.out.println("Please Enter Your surname: ");
	Scanner sc=new Scanner(System.in);
	surname=sc.next();
	
}

class Child extends Parent {

	
	

	Child obj=new Child();
	
	String firstLastName;
	System.out.println("Please Enter full name: ");
	Scanner sc=new Scanner(System.in);
	firstLastName=sc.next();
	System.out.println("your surname "+obj.surname);
	System.out.println("your firstLastName "+obj.firstLastName);
	
	
}

}
	

	

	