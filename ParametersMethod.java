class ParametersMethod {

	// Method ---1
	
	/*
	static void myMethod(String name) {

		System.out.println("Welcome To Amex "+name);
	}

	public static void main(String[] args) {
		
		myMethod("Rajesh");
		myMethod("Kumar");
		myMethod("Naidu");
	}

	*/

	//method 2

	/*
	static void myMethod1(String name, int age) {

		System.out.println(name+ " is "+age);
	}
	
	public static void main(String args[]){
		myMethod1("Rajesh",25);
		myMethod1("Kumar",29);
		myMethod1("MRK",36);
	}

	*/

	
	//method 3
	
	
	/*
	static int myMethod2(int x){
		return 5+x;
	}
	public static void main(String args[]) {

	System.out.println(myMethod2(3));
	
	}
	*/

	/*
	//method-4

	static int myMethod3(int x,int y) {

		return x+y;
	}

	public static void main(String args[]) {

		System.out.println(myMethod3(7,3));
	}

	*/

	//Method -5


	/*
	static int myMethod4(int x,int y) {

		return x+y;
	}

	public static void main(String args[]) {

	int z=myMethod4(7,6);

	System.out.println(z);
	}

	*/

	static void CheckAge(int age) {

		if(age>10) 
			System.out.println("Access Granted");

		else
			System.out.println("Access denied");
	}
		
	public static void main(String args[]) {
	
		CheckAge(25);

	}

}

		