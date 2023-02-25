import java.util.*;
public class Program307a
{

{
	static double perimeter_of_a_circle(double radius)
	{
      return 2*(Math.PI)*radius;
	}
	public static void main(String[]args)
	{
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the radius of the circle:");
      radius=sc.nextInt();
		System.out.println("perimeter of the circle:"+ perimetar_of_a_circle(radius));
	}
}
}