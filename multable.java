class multable
{
int n,i;
multable(int a)
{
n=a;
}
void display()
{
for(i=1;i<13;i++)
{
System.out.println(n+" * "+i+" = "+n*i);
}
}
public static void main(String args[])
{
multable z=new multable(7);
z.display();
}
}

