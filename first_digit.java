// public class first_digit
// {
// 	public static void main(String args[])
// 	{
// 		int no=12345;
// 		int rem=0;
// 		while(no>0)
// 		{
// 			rem=no/10;
// 		}
// 		System.out.println(rem);
// 	}
// }



public class first_digit {
    public static void first(int no) {
        while(no >= 10) {
            no = no / 10;
        }

        System.out.println(no);
    }

    public static void main(String args[]) {
        first(1234);
    }
}



















