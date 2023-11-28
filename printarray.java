import java.util.Scanner;
p
public class printarray
{ublic static void main(String args[])
{
int x[]=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
x[i]=s.nextInt();
}
int s1=0,s2=0;
for(int i=0;i<5;i++)
{
if(x[i]%2==0)
{s1+=x[i];}
if(x[i]%2==1)
{s2+=x[i];}
}
System.out.println("Sum of Odd nos :"+s2);
System.out.println("Sum of Even nos :"+s1);
}}
