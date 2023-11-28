class student
{
int reg,m1,m2,m3,m4,m5,t;
String n;
double avg=0.00f;
student(int a1,String a2)
{
n=a2;
reg=a1;
}
student(int x,int y,int z,int m,int n)
{
m1=x;
m2=y;
m3=z;
m4=m;
m5=n;
}
void calculations()
{
t=m1+m2+m3+m4+m5;
avg=t/5;
System.out.println("Total Marks : "+t);
System.out.println("Average Marks : "+avg);
}
void display()
{
System.out.println("Student Name : "+n);
System.out.println("Reg No : "+reg);
}
public static void main(String args[])
{
student z1=new student(4048,"Palash");
z1.display();
student z2=new student(78,68,97,70,88);
z2.calculations();
}
}
