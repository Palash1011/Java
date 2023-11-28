import java.util.Scanner;
public class OddorEven
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int y=a.nextInt();
if(y%2==0)
{
System.out.println("Even");
}
else
{
if(y==0)
{
System.out.println(" add 2 to get evenno");
}
else
{
System.out.println("add 1 to get even no");
}
}
}
}


