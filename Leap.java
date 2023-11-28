import java.util.Scanner;
public class Leap
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int y=a.nextInt();
if(y%4==0||y%100!=0&&y%400==0)
{
System.out.println("Leap");
}
else
{
if(y%100!=0)
{
int n=y%4;
System.out.println(4-n);
}
else
{
System.out.println("4");
}
}
}
}
