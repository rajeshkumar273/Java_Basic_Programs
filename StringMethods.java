import java.util.Scanner;

class StringMethods {

	public static void main(String args[]) {

	String name="Mothukuri Rajesh Kumar";  //literal
	String name1=new String("Sohail Khan Pathan"); //new keyword

	String name2=new String("RRR");
	String name3=new String("rrr");
	String name4=new String();
	String name5=new String(" RRR");
	String name6=new String(" rrr");

	System.out.println(name.charAt(2));

	System.out.println(name.lastIndexOf('o'));

	System.out.println(name.contains("v")); //false
	System.out.println(name.contains("R")); //true
		
	System.out.println("'endsWith Method'"); 
	System.out.println(name.endsWith("Kumar")); //true
	System.out.println(name.endsWith("v")); //false
	System.out.println(name.endsWith("r")); //false
	
	System.out.println(name.replace("Kumar","Naidu")); 
	
	System.out.println(name.length());

	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());

	System.out.println(name.concat(" Software Developer"));
		//s3=s1+s2;
	System.out.println(name.substring(10));

	System.out.println("Equals Method");
	System.out.println(name.equals(name1));
	System.out.println(name2.equalsIgnoreCase(name3));

	System.out.println(name.isEmpty());
	System.out.println(name4.isEmpty());
	System.out.println(name5);
	System.out.println(name6);
	System.out.println(name5.trim());
	System.out.println(name6.trim());
	
	System.out.println(name.compareTo(name1));
	/*
		if name>name1 returns positive value
		if name<name1 returns Negative value
		if name=name1 returns  value 0
	*/
	

	System.out.println(name.indexOf("Rajesh"));
	//System.out.println(reverse(name));
	


	
	
}

}
