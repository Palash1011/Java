import java.util.*;
public class q2
{
public static void main(String args[])
{
int i,sum=0,j,median,mode=0;
float mean=0.0f;
Scanner L=new Scanner(System.in);
System.out.println("Enter the Length of array");
int l=L.nextInt();
int arr[]=new int[l];
Scanner s=new Scanner(System.in);
System.out.println("Enter the Elements");
for(i=0;i<l;i++)
{
arr[i]=s.nextInt();
}
Arrays.sort(arr);
for(i=0;i<l;i++)
{
sum+=arr[i];
}
mean=sum/l;
System.out.println("Mean :"+mean);
if(l%2==0)
{
median=(arr[l/2]+arr[(l/2)+1])/2;
}
else
{ median=arr[((l+1)/2)-1];  }
System.out.println("Median : "+median);
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(arr[i]==arr[j])
{
mode=arr[i];
}
}
}
System.out.println("Mode :"+mode);
}
}

