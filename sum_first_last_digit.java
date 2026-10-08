// public class sum_first_last_digit{
// 	public static void main(String args[])
// 	{
// 		int n=12345;
// 		int last=n%10;
// 		int first=n;
// 		while(first>=10)
// 		{
// 			first=first/10;
// 		}
// 		int sum=first+last;
// 		System.out.println(sum);
		
// 	}
// }

public class sum_first_last_digit{
	public static void main(String args[])
	{
		int n=123456;
		int last=n%10;
		int first=n;
		while(first>=10)
		{
			first=first/10;
		}
		int sum=first+last;
		System.out.println(sum);

	}
}