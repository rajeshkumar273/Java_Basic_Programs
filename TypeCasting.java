public class TypeCasting {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    String s="10";
    int n=20;

    //int a=(int) s;
    float b=(float) n;

    String str = "100";
    System.out.println(str+20);
    int i=Integer.parseInt(str);
    System.out.println(i+20);

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
    //System.out.println(a);
    System.out.println(b); //20.0



    //We can check the type of a variable in Java by calling getClass().getSimpleName() method via the variable.


 	String str1 = "Sample String";
        System.out.println(str.getClass().getSimpleName());

	//This method is callable by objects only; therefore, to check the type of primitive data types, we need to cast the primitive to Object first.

	System.out.println(((Object)n).getClass().getSimpleName());
	System.out.println(((Object)b).getClass().getSimpleName());
  }
}