import java.util.Scanner;
class Number
{

 private int n;
 public void setn(int n)
	{
	 this.n=n;
	}//setn1
 public int getn()
	{
	 return n;
	}//getn1
	public int sumDigit() 
	{ //n1=12345
		int sum=0;
		int n=this.n;
		while(n>0)
		{
			sum=sum+n%10;//sum+=n%10
			n=n/10;
		}//while
		return sum;
	}//sum Digit
}//Number
class Test3
{
	public static void main(String[]args)
	{
	Number ob=new Number();
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
	int temp=sc.nextInt();
	ob.setn(temp);
	int res =ob.sumDigit();
	System.out.println("sum of digit of"+ob.getn()+ "is" +res);
	}
	}