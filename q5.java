import java.util.Scanner;
public class q5
{
public static void main(String args[])
{
int i,s1=0,s2=0,c1=0,c2=0;
int arr[]=new int[10];
Scanner a=new Scanner(System.in);
System.out.println("Enter -1 to Exit");
for(i=0;i<10;i++)
{
int v=0;
System.out.println("Enter the Numbers");
v=a.nextInt();
if(v==-1)
{
break;}
else{arr[i]=v;}
}
for(i=0;i<10;i++)
{
if(arr[i]>0)
{
s1+=arr[i];
c1++;
}
else
{ s2+=arr[i];
c2++;}
}
double a1=s1/c1;
double a2=s2/c2;
System.out.println("Positive Avg : "+a1);
System.out.println("Negative Avg : "+a2);
}
}
