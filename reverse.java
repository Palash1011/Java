import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=0,rem;
while(n!=0)
{
rem=n%10;
sum=(sum*10)+rem;
n/=10;
}
System.out.println(sum);
}
}
