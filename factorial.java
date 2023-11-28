import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=1,i=1;
for(i=1;i<=n;i++)
{
sum*=i;
}
System.out.println(sum);
}}

