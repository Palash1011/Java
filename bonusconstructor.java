class bonusconstructor
{
int s,g;
double bo=0.00f;
bonusconstructor(int a,int b)
{
s=a;
g=b;
}
void bonus()
{
if(g==1)
{
bo=s*0.05;
}
else
{
bo=s*0.01;
}
System.out.println("Bonus :"+bo);
}
public static void main(String args[])
{
bonusconstructor z=new bonusconstructor(20000,2);
z.bonus();
}
}

