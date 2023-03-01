import java.util.Scanner;
class Number
{
 private int n;
 public void  setn(int n)
 {
 this.n=n;
 }//setn1
 public int getn()
 {
return this.n;
}// getn1
public int sumDigit()
{

int sum=0;
int n=this.n;
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
}
class Test
{
	public static void main(String[]args)
	
		Number ob=new Number();
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int temp=sc.nextInt();
		ob.sent1(temp);
			int res=ob.sumDigit();
		System.out.println("Sum of digits of+"ob.getn()+ is"+res);
	}
}