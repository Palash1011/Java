import java.util.Scanner;
class sol
{
int r;
double ar=0.00f,c=0.00f;
void area()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius");
r=s.nextInt();
}
void circumference()
{
ar=3.14*r*r;
c=6.28*r;
System.out.println("Area : "+ar);
System.out.println("Circumference : "+c);
}
}
class circle
{
public static void main(String args[])
{
sol a=new sol();
a.area();
a.circumference();
}
}
