//static block

//It is used to initialize the static data member

//This block is executed before main method at the time

class StaticInitializationBlock{
   static{
      System.out.println("class without a main method");
      System.exit(0);
   }
}