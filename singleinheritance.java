class parent
{
int x=10;
void display()
{
System.out.println("Parent has "+x+" crores");
}
}
class child extends parent
{
void display1()
{
System.out.println("Therefore the Child inherits "+x+" crores");
}
}
class singleinheritance
{
public static void main(String args[])
{
child c=new child();
c.display();
c.display1();
} 
}
