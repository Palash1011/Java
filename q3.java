import java.util.Scanner;
public class q3
{
public static void main(String args[])
{
Scanner n1=new Scanner(System.in);
System.out.println("Enter the character");
String s=n1.nextLine();
Scanner n2=new Scanner(System.in);
System.out.println("Enter the no of rows");
int n=n2.nextInt();
int i,j;
for(i=0;i<=n;i++)
{
for(j=0;j<i;j++)
{
System.out.print(s+" ");
}
System.out.println();
}
}
}
