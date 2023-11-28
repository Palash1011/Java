import java.util.Scanner;
import java.lang.Math;
class sol
{
int p,r,t;
double si=0.00f,ci=0.00f;
void ip()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Principal,rate and time");
p=s.nextInt();
r=s.nextInt();
t=s.nextInt();
}
void op()
{
si=(p*r*t)/100;
int d=(1+r/100);
ci=(Math.pow(d,t));
System.out.println("Simple Interest : "+si);
System.out.println("Compound Interest : "+ci);
}
}
class sici
{
public static void main(String args[])
{
sol a=new sol();
a.ip();
a.op();
}
}
