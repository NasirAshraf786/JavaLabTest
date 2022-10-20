import java.util.Scanner;

public class CheckBill
{   
    public static void bill(int units)
    {
      int total = units * 540;
      
       checkDiscount(total);
      
     
    }
    
    public static double checkDiscount(int total)
    {
        if(total>= 2000)
        {
            double afterDiscount = total - (total*10)/100.0d;
            System.out.println("BILL AFTER DISCOUNT " + afterDiscount);
        }
        else 
        System.out.println("NO DISCOUNT !!! YOUR BILL " +total);
    }
	
	
    public static void main(String args[])  
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.in("HOW MANY UNNIT HAS BEEN PURSASED ");
	
    int units = sc.nextInt();
    
   }
}