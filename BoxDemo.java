class Box
{
 public double width;
 public double height;
 public double depth;
}
class BoxDemo
{
public static void main(String[]args)
{
Box mybox=new Box();
double vol;
mybox.width=100;
mybox.height=200;
mybox.depth=150;
vol=mybox.width*mybox.height*mybox.depth;
System.out.println("Volme is"+vol);
}
}