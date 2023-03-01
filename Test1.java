class MyDate
{
	public int day;
	public int month;
	public int year;
}
class Test1
{
	public static void main(String[]args)
	{
		MyDate md1=new MyDate();
		md1.day=4;
		md1.month=7;
		md1.year=2002;
		System.out.println(md1+"_"+md1.month+" _"+md1.year);
	}
}
