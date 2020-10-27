import java.util.*;
class Marriage
{
	public static void main(String args[])
	{
		int age;
		char gender,m;
		String c,a="eligible",b="not eligible";
		
		Scanner sc=new Scanner(System.in);

		System.out.println("   Enter Gender...(m/f)  ");
		
		gender=sc.next().charAt(0);
		
		System.out.println("   Enter age...  ");
		
		age=sc.nextInt();
		
		c=(gender=='m'?(age>=21?a:b):(age>=18?a:b));
		System.out.println("Person is "+c);
		
	}
}
