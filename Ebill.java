import java.util.Scanner;
public class Ebill {
    public static void main(String[] args)
{
Scanner a =new Scanner(System.in);
Scanner b =new Scanner(System.in);
Scanner c =new Scanner(System.in);
Scanner d =new Scanner(System.in);
int cno=a.nextInt();
String cname=b.nextLine();
int m1=c.nextInt();
int m2=d.nextInt();
double amt=0.00;
//Swap if CMR is less than LMR
if(m1<m2)
{ int t=m1;
  m1=m2;
  m2=t;
}
int u=m1-m2;
System.out.println("Customer No :"+cno); 
System.out.println("Customer Name :"+cname); 
System.out.println("Current Mosnth Bill :"+m1);
System.out.println("Last month bill :"+m2);
System.out.println("Units :"+u);
if(u<=100&&u>0)
{ amt=0;}
else if(u>100&&u<=300)
{amt=(u-100)*2.25;}
else if(u>300&&u<500)
{amt=((u-300)*3.75)+450;}
else
{amt=((u-500)*5.50)+1200;}
System.out.println("Amount :"+amt);
}
}
