import java.util.Scanner;
public class primecomposite
{
public static void main(String args[])
{
int i,c1=0,c2=0,j,n=10,k=0,l=0;
int arr[]=new int[10];
int p[]=new int[10];
int c[]=new int[10];
Scanner a=new Scanner(System.in);
for(i=0;i<n;i++)
{
System.out.println("Enter the Number "+(i+1)+" : ");
arr[i]=a.nextInt();
}
for(i=0;i<n;i++)
{
int c3=0;
for(j=2;j<=arr[i]/2;j++)
{
if(arr[i]%j==0)
{
c3++;
break;
}
}
if(c3==1)
{
c1+=1;
c[k]=arr[i];
k++;
}
else
{
c2+=1;
p[l]=arr[i];
l++;
}
}
System.out.println("No of Prime Numbers : "+c2);
System.out.println("Prime Numbers : ");
for(i=0;i<c2;i++)
{
System.out.print(p[i]+" ");
}
System.out.println("\nNo of Composite Numbers : "+c1);
System.out.println("Composite Numbers : ");
for(i=0;i<c1;i++)
{
System.out.print(c[i]+" ");
}
System.out.println();
}
}
