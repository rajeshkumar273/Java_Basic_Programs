class MethodOverloading {

	static int plusMethod(int x,int y) {

		return x+y;
	}

	static double plusMethod(double x,double y) {

		return x+y;
	}

	public static void main(String args[]) {

		int num1=plusMethod(7,3);
		double num2=plusMethod(3.4,6.49);
	
		System.out.println("Int: "+num1);
		System.out.println("Double: "+num2);
	}

}

		