import java.util.Scanner;
class bankwithdraw
{
public static void main(String args[])
{
int a[]=new int[4];
int b[]=new int[4];
int w=0,z=0,i;
Scanner s1=new Scanner(System.in);
System.out.println("Enter The Balance : ");
int bal=s1.nextInt();
int ba=bal;
Scanner s2=new Scanner(System.in);
System.out.println("Enter The Denomination Priority : \n1.2000\n2.500\n3.200\n4.100");
for(i=0;i<4;i++)
{
a[i]=s2.nextInt();
}
Scanner s3=new Scanner(System.in);
for(i=0;i<4;i++)
{
if(a[i]==1)
{
System.out.println("Enter The No of 2000 Notes : ");
b[z]=s3.nextInt();
w+=(b[z]*2000);
z++;
}
if(a[i]==2)
{
System.out.println("Enter The No of 500 Notes : ");
b[z]=s3.nextInt();
w+=(b[z]*500);
z++;
}
if(a[i]==3)
{
System.out.println("Enter The No of 200 Notes : ");
b[z]=s3.nextInt();
w+=(b[z]*200);
z++;
}
if(a[i]==4)
{
System.out.println("Enter The No of 100 Notes : ");
b[z]=s3.nextInt();
w+=(b[z]*100);
z++;
}
}
if(w>bal)
{
System.out.println("Insufficient Balance Cannot Perform Withdrawl");
}
else
{
bal-=w;
}
System.out.println("Withdrawl Amount :"+w"Available Balance : "+b);
System.out.println("Withdrawl Successful !\nNew Balance : "+bal);
}
}


