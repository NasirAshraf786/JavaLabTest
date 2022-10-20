import.java.util.Scanner;

public class AgeComparision
{
    public static void oldest(int x, int y, int z)
	{
	    
	    if(x>y && x>z)
		System.out.println(x + " OLDEST ");
		
		else if(y>x && y>z)
		System.out.println(y +" OLDEST");
		
		else
		System.out.println(z +" OLDEST"):
	}
	
	public static void youngest(int x, int y, int z)
	{
		
		if(x<y && x<z)
		  System.out.println(x + " Youngest ");
	   
	    else if (y<x && y<z)
			System.out.println(y +" YOUNEST");
		
		else
			System.out.println(z + "  YOUNGEST");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.Pritnln("ENTER YOUR AGE \n");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		oldest(a,b,c);
		youngest(a,b,c);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}