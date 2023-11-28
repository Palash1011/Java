import java.util.Scanner;
class add
{
int x,y;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 numbers");
x=s.nextInt();
y=s.nextInt();
int su=x+y;
System.out.println("Sum : "+su);
}
}
class sum
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
