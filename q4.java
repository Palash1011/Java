import java.util.Scanner;
public class q4
{
public static void main(String args[])
{
Scanner n1=new Scanner(System.in);
Scanner n2=new Scanner(System.in);
Scanner n3=new Scanner(System.in);
Scanner n4=new Scanner(System.in);
int m1=n1.nextInt();
int m2=n2.nextInt();
int m3=n3.nextInt();
int m4=n4.nextInt();
int total=m1+m2+m3+m4;
double a=total/4;
System.out.println(a);
if(m1>100||m2>100||m3>100||m4>100)
{
System.out.println("Entered Marks must be less than 100");}
else if(m1<0||m2<0||m3<0||m4<0)
{
System.out.println("Entered Marks Must be positive");
}
else{
if(a>75)
{
System.out.println("Distinction");
}
else if(a>=60 && a<75)
{
System.out.println("First Division");
}
else if(a>=50 && a<60)
{
System.out.println("Second Division");
}
else if(a>=40 && a<50)
{
System.out.println("Third Division");
}
else
{
System.out.println("Failed");
}
}
}
}
