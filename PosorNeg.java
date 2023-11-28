import java.util.Scanner;
public class PosorNeg
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int y=a.nextInt();
if(y>0)
{
System.out.println("Positive");
}
else
{
int o=-y+1;
System.out.println("Add "+o+" to get the positive number 1");
}
}
}
