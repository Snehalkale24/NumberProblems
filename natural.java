import java.util.*;

public class natural
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no:");
		int n=s.nextInt();
		int sum=0;
		for(int i=2;i<n;i++)
		{
         
           sum=i+sum;
         
      }
          System.out.println("sum"+sum);	
      }		
}