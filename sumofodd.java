import java.util.*;
public class sumofodd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a=s.nextInt();
        System.out.println("enter second no:");
        int b=s.nextInt();
        System.out.println("enter third no:");
        int c=s.nextInt();

        if(a<=b && a<=c)
        {
        	System.out.println("smallest:"+a);
        }
        else if(b<=a && b<=c)
        {
        	System.out.println("smallest:"+b);
        }
        else{
        	System.out.println("smallest:"+c);
        }
        
      
     
	}
}