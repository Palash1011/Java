import java.util.*;
public class mthmaxnthmin
{
public static void main(String args[])
{
int x[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("Enter The Array Elements :");
for(int i=0;i<5;i++)
{
x[i]=s.nextInt();
}
//Arrays.sort(x);
for(int i=0;i<5;i++)
{
for(int j=i+1;j<5;j++)
{
if(x[i]<x[j])
{
int t=x[i];
x[i]=x[j];
x[j]=t;
}
}
}
Scanner a=new Scanner(System.in);
Scanner b=new Scanner(System.in);
int m=a.nextInt();
int n=b.nextInt();
int min=x[n+1];
int max=x[-m];
System.out.println(max+min);
System.out.println(max-min);
}
}
