import java.util.Scanner;
public class diagonalsum
{
public static void main(String args[])
{
int i,j,s=0;
Scanner p=new Scanner(System.in);
System.out.println("Enter Matrix ");
int a[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=p.nextInt();
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
if(i==j)
{
s+=a[i][j];
}
}
}
System.out.println("Diagonal Sum :",s);
}
}
