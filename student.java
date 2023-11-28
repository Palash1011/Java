import java.util.Scanner;
class student
{
int reg,m1,m2,m3,m4,m5,t;
String n;
double avg=0.00f;
student()
{
Scanner p=new Scanner(System.in);
System.out.println("Enter the name");
n=p.nextLine();
Scanner q=new Scanner(System.in);
System.out.println("Enter the Reg no");
reg=q.nextInt();
}
student(int x,int y)
{
Scanner r=new Scanner(System.in);
System.out.println("Enter the Subject marks");
m3=r.nextInt();
m4=r.nextInt();
m5=r.nextInt();
m1=x;
m2=y;
}
void calculations()
{
t=m1+m2+m3+m4+m5;
avg=t/5;
}
void display()
{
System.out.println("Student Name : "+n);
System.out.println("Reg No : "+reg);
System.out.println("Total Marks : "+t);
System.out.println("Average Marks : "+avg);
}
public static void main(String args[])
{
student z=new student();
z.calculations(67,78);
z.display();
}
}
