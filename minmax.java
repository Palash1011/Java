import java.util.*;
public class minmax
{
public static void main(String args[])
{
int x[]=new int[5];
Scanner s=new Scanner(System.in);
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
int min=x[4];
int max=x[0];
System.out.println(max+min);
System.out.println(max-min);
}
}
