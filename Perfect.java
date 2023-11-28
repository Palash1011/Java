import java.util.Scanner;
public class Perfect
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=0,i;
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(n==sum)
{
System.out.println("Yes");
}
else
{System.out.println("No");}
}
}
