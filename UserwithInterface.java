class IGuest {
	
	public void read();

}

class IDeveloper{

	public void write();
}

class IAdmin extends IGuest, IDeveloper {

	public void manage();

}


class UserwithInterface implements IAdmin {

	public static void main(String args[]) {
	

	}
	
	@Override
	public void read() {
		System.out.println("read");
	}
	
	@Override
	public void write() {
	
		System.out.println("write");
	}

	@Override
	public void manage() {
	
		System.out.println("Manage");
	}


	
}