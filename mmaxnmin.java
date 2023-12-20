import java.util.*;
public class mmaxnmin
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
Arrays.sort(x);
Scanner a=new Scanner(System.in);
System.out.println("Enter The 'M' Value : ");
int m=a.nextInt();
Scanner b=new Scanner(System.in);
System.out.println("Enter The 'N' Value : ");
int n=b.nextInt();
int min=x[n-1];
int max=x[5-m];
System.out.println(m+"th Max : "+max);
System.out.println(n+"th Min : "+min);
System.out.println("Sum : "+(max+min));
System.out.println("Difference : "+(max-min));
}
}
