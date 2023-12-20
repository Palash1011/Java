import java.util.Scanner;
class skip
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter The Starting and the Ending Point : ");
int a=s.nextInt();
int b=s.nextInt();
int t=a;
Scanner s1=new Scanner(System.in);
System.out.println("Enter The 'K' Value : ");
int k=s1.nextInt();
System.out.println("Numbers Between "+a+" and "+b+" : ");
while(t<b-k)
{
t+=k;
System.out.println(t);
}
}
}
