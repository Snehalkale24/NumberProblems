// public class product
// {
// 	public static void main(String args[])
// {
// 	int no=123345;
// 	int prod=1;
// 	while(no>0)
// 	{
// 		int mul=no%10;
// 		prod=prod*mul;
// 		no=no/10;
// 	}
// 	System.out.println("product of digit"+prod);
// }
// }



public class product{
	public static void prod(int no)
	{
		int product=1;
		while(no>0){
			int digit=no%10;
			product=product*digit;
			no=no/10;
		}
		System.out.println(product);
	}
	public static void main(String args[])
	{
		prod(1234);
	}
}