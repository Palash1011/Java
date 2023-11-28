import java.util.Scanner;
class add
{
int x,y,sum;                                                                                       
add()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 numbers");
x=s.nextInt();
y=s.nextInt();
}
void display()
{
sum=x+y;
System.out.println("Sum : "+sum);
}
}
class sumconstructor
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
