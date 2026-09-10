// public class last_digit{
// 	public static  void last(int no)
// 	{
// 		int last=0;
// 		while(no>0)
// 		{
// 			last=no%10;
// 		}
// 		System.out.println(last);
// 	}
// 	public static void main(String args[])
// 	{
// 		last(11234);
// 	}
// }



public class last_digit{
	public static void last(int no)	{
		int last=0;
		while(no>0)
		{
			last=no%10;
		}
		System.out.println(last);
	}
	public static void main(String args[])
	{
		last(1234);
	}
}