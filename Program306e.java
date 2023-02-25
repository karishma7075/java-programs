import java.util.Scanner;
public class Program306e
{
	static void displayMonth(int Month_no)
	{
	String s=new String();
  if(Month_no==1) s="Jan";
 if(Month_no==2) s ="Feb";
if(Month_no==3) s  ="Mar";
if(Month_no==4) s ="Apr";
 if(Month_no==5) s ="May";
 if(Month_no==6) s="Jun";
if(Month_no==7) s ="Jul";
if(Month_no==8) s="Aug";
if(Month_no==9) s="Sep";
if(Month_no==10) s="Oct";
if(Month_no==11) s="Nov";
if(Month_no==12) s="Dec";
if(Month_no<1||Month_no>12) s="Incorrect Month number";
System.out.println("Month is:"+s);
}
    public static void main(String[]args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Month number(1-12):");
int Month_no=sc.nextInt();
displayMonth(Month_no);
}
}