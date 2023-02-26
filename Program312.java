import java.util.*;
public class Program312
{ 
	public static void main(String[]args)
	{
		int a,b,c;
		System.out.println("enter three numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int max=0;
		max=((a>b)&&(a>c))?d:((b>a&&(b>c))?b:((c>a)&&(c>b))?c:a));
		System.out.println("the largest among the three numbers is"+max);
	}
}

	                                      
