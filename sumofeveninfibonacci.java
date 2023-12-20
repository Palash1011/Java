import java.util.Scanner;
class sumofeveninfibonacci
{
public static void main(String args[])
{
int a=0,b=1,c,s=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The 'N' Value : ");
int n=sc.nextInt();
System.out.print("Fibonacci Series : 0 1 ");
for(i=2;i<n;i++)
{
c=a+b;
System.out.print(c+" ");
if(c%2==0)
{
s+=c;
}
a=b;
b=c;
}
System.out.println("\nSum of Even Numbers in The Fibonacci Series : "+s);
}
}

