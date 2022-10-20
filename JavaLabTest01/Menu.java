import java.util.Scanner;

public class Menu
{   
    static void square(int num)
	{
		
		int result = num*num;
		
		System.out.Println(result + " IS THE SQUARE OF " +num);
	}
	
	static void cube(int num)
	{
		
		int result = num*num*num;
		
		System.out.println(result + " IS THE CUBE OF " + num);
		
	}
	
	static void evenOrOdd(int num)
	{
		
		
		if(num%2 == 0)
			System.out.Println("EVEN NUMBER ");
		
		else
			System.out.println("ODD NUMBER ");
	}
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRESS KEY FOR THE OPTION GIVEN BELOW ");
		System.out.println("1 : TO FIND THE SQUARE ");
		System.out.println("2 : TO FIND THE CUBE ");
		System.out.println("3 : TO FIND THE EVEN OR ODD");
		
		int y = sc.nextInt();
		
		System.out.println("ENTER THE NUMBER ");
		int number = sc.nextInt();
		  
		
		
		switch(y)
		{
			case 1: square(number);
			        break;
			
			case 2: cube(number);
			        break;
			
			case 3: evenOrOdd(number);
			        break;
			
			default :
			          System.out.println("YOU ARE PRESSED INVALID KEY ");
			          break;
		}
	}
}