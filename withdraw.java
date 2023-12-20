import java.util.Scanner;
class withdraw
{
public static void main(String args[])
{
int a[]=new int[4];
int w=0,i;
Scanner s1=new Scanner(System.in);
System.out.println("Enter The Balance : ");
int bal=s1.nextInt();
System.out.println("Enter The Amount to Withdraw : ");
int wit=s1.nextInt();
int ba=bal-wit;
if(w>bal)
{
System.out.println("Insufficient Balance Cannot Perform Withdrawl");
}
else
{
Scanner s2=new Scanner(System.in);
System.out.println("Enter The Denomination Priority : \n1.2000\n2.500\n3.200\n4.100");
for(i=0;i<4;i++)
{
a[i]=s2.nextInt();
}
for(i=0;i<4;i++)
{
if(a[i]==1&&wit>0)
{
int r1=wit/2000;
wit/=r1;
System.out.println("Number of 2000:"+r1);
}
else if(a[i]==2&&wit>0)
{
int r2=wit/500;
wit/=r2;
System.out.println("Number of 500:"+r2);
}
else if(a[i]==3&&wit>0)
{
int r3=wit/200;
wit/=r3;
System.out.println("Number of 200:"+r3);
}
else if(a[i]==4&&wit>0)
{
int r4=wit/100;
wit/=r4;
System.out.println("Number of 100:"+r4);
}
else
{}
System.out.println("Withdral Successfull !\nNew Balance : "+ba);
}
}
}
}


