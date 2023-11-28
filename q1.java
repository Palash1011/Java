import java.util.Scanner;
public class q1
{
public static void main(String args[])
{
Scanner n1=new Scanner(System.in);
System.out.println("Enter the Starting Value");
int a=n1.nextInt();
Scanner n2=new Scanner(System.in);
System.out.println("Enter the Ending Value");
int b=n2.nextInt();
int i,j;
if(a==b)
{ System.out.print("A and B must not be Equal"); }
else if(a<0||b<0){ System.out.println("A and b must be +ve");}
else{
System.out.println("Composite Numbers :");
for(i=a;i<=b;i++)
{
int c=0;
for(j=2;j<i/2;j++)
{
if(i%j==0)
{
c++;
break;
}
}
if(c==1)
{
System.out.println(i);
}
}
}
}
}


