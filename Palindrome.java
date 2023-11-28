import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=0,rem;
int m=n;
while(n!=0)
{
rem=n%10;
sum=(sum*10)+rem;
n/=10;
}
if(m==sum)
{
System.out.println("Yes");
}
else
{System.out.println("No");}
}
}
