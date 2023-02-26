public class Scope
{
public static void main(String[]args)
{
System.out.println("this is example to understand,Scopeof variable");
int i;
i=15;
{
System.out.println("We are in a new block");
int j;
j=i*i;
System.out.println("i and j in new block are"+i+" "+j);
}
int k;
k=i+1;
int j;
j=k+100;
System.out.println("i and j out the new blocks are"+i+""+j);
}
}
