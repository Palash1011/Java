class upperpart
{
int n=3,i,j;
void d()
{
for(i=0;i<n;i++)
{
for(j=n;j>i;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print(" *");
}
System.out.println("");
}
}
}
class lowerpart extends upperpart
{
void d1()
{
for(i=0;i<n-1;i++)
{
for(j=n+1;j>i;j--)
{
System.out.print(" ");
}
for(j=n-1;j>i;j--)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
}
class diamond
{
public static void main(String args[])
{
lowerpart z=new lowerpart();
z.d();
z.d1();
}
}
