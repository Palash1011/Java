import java.util.Scanner;
class gcd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter The Two Numbers : ");
int a=s.nextInt();
int b=s.nextInt();
for(int i=b;i>0;i--)
{
if(a%i==0&&b%i==0)
{
System.out.println("GCD : "+i);
System.out.println("LCM : "+(a*b)/i);
break;
}
}
}
}
