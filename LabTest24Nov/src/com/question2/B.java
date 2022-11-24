package com.question2;

//parent class 
class A
{
   public void print1() 
   {
	
	  System.out.println("THIS IS PARENT CLASS METHOD ");
   }

}

//DECLARING a class "B" and inheriting to class "A"
class B extends A //child class
{
	
   public void print2()
   {
	   System.out.println("THIS IS CHILD CLASS METHOD ");
   }
   
   
   public static void main(String[] args)
   {
	//CREATING OBJECT OF PARENT CLASS "A"
	   A obj1 = new A();
	//CALLING PARENT CLASS METHOD BY USING PARENT CLASS OBJECT   
	   obj1.print1();
	   
	 //CREATING OBJECT OF PARENT CLASS "A"
	   B obj2 = new B();
	 //CALLING PARENT CLASS METHOD BY USING PARENT CLASS OBJECT   
	   obj2.print2();
	 //CALLING PARENT CLASS METHOD BY USING PARENT CLASS OBJECT   
	   obj2.print1();
	   
   }
}
