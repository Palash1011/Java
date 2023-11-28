import java.util.*;
public class sortarray
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
System.out.println("Elemets in Ascending Order: ");
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
}}
