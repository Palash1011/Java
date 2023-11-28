import java.util.Scanner;
class arithmeticconstructor
{
int x,y,sum,dif,div,mod,pro;                                                                                       
arithmeticconstructor()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 numbers");
x=s.nextInt();
y=s.nextInt();
}
void display()
{
sum=x+y;
dif=x-y;
pro=x*y;
mod=x%y;
div=x/y;
System.out.println("Sum : "+sum);
System.out.println("Difference : "+dif);
System.out.println("Product : "+pro);
System.out.println("Quotient: "+div);
System.out.println("Modulous : "+mod);
}
public static void main(String args[])
{
arithmeticconstructor a=new arithmeticconstructor();
a.display();
}
}
