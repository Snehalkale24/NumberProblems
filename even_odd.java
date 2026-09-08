import java.util.*;
public class even_odd{
	public static void even(int no)
	{
			if(no%2==0)
			{
				System.out.println("even"+no);
			}
			else{
				System.out.println("odd"+no);
			}
		}
	public static void main(String args[])
	{
		even(12);
	}
}