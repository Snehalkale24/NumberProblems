// public class sum_digit{
// 	public static void sum(int no)
// 	{
// 		int sum=0;
// 		while(no>0)
// 		{
// 		int nno=no%10;
// 		sum=sum+nno;
// 		no=no/10;
// 	}
// 	System.out.println(sum);
// }
// public static void main(String args[])
// {
// 	sum(12345);
// }

// }




public class sum_digit{
	public static void sum(int no)
	{
		int sum=0;
		while(no>0)
		{
			int store=no%10;
			sum=sum+store;
			no=no/10;
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		sum(12345);
	}
}






