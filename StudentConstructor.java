class StudentConstructor

	{
		//parameterized Constructor

	int id;
	String name;

	StudentConstructor(int i, String n) {

	id=i;
	name=n;
	
	}

	void display() {

		System.out.println(id+" "+name);

	}

	public static void main(String args[]) {

	StudentConstructor s1=new StudentConstructor(12,"Rajesh");
	StudentConstructor s2=new StudentConstructor(13,"Kumar");

	s1.display();
	s2.display();

	}

}