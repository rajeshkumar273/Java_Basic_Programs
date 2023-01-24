
class Guest {

	public void read() {

		System.out.println("Read Code");
	}

}
class Developer extends Guest {

	public void write() {
		
		System.out.println("Write Code");

	}	

}

class Admin extends Developer {
		
	//Adding or deleting the products/application

	public void manage() {
		super.read();
		super.write();

		System.out.println("Manage code");
	}

	public void read() {

		System.out.println("Admin Read Code");

}
}



public class User{ 

	public static void main(String args[]) {
	

		Admin a=new Admin();

		a.read();
		//a.write();
		a.manage();



	}
}







