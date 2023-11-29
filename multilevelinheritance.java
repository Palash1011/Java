class grandparent
{
int x=10;
void display()
{
System.out.println("GrandParent has "+x+" crores.");
}
}
class parent extends grandparent
{
void display1()
{
System.out.println("Hence the Parent inherits "+x+" crores from the Grand parent.");
}
}
class child extends parent
{
void display2()
{
System.out.println("Therefore the Child inherits "+x+" crores from the Parent.");
}
}
class multilevelinheritance
{
public static void main(String args[])
{
child c=new child();
c.display();
c.display1();
c.display2();
} 
}
