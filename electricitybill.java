import java.util.Scanner;
class solution
{
double no=0.00f,cmr=0.0f,lmr=0.00f,u=0.00f,amt=0.00f;
void getdata()
{
Scanner p=new Scanner(System.in);
System.out.println("Enter the Customer no");
no=p.nextInt();
Scanner q=new Scanner(System.in);
System.out.println("Enter the Cmr");
cmr=q.nextInt();
Scanner r=new Scanner(System.in);
System.out.println("Enter the lmr");
lmr=r.nextInt();
}
void calculate()
{
if(cmr<lmr)
{
System.out.println("Error! Inaccurate Readings\n LMR cannot be more than CMR");
}
else
{
u=cmr-lmr;
if(u<=100&&u>0)
{ amt=0;}
else if(u>100&&u<=300)
{amt=(u-100)*3;}
else if(u>300&&u<500)
{amt=((u-300)*7.50)+600;}
else
{amt=((u-500)*10)+2100;}
System.out.println("Customer No : "+no);    
System.out.println("Units Consumed : "+u);
System.out.println("Electricity Bill : "+amt);
}
}
}
class electricitybill
{
public static void main(String args[])
{
solution a=new solution();
a.getdata();
a.calculate();
}
}

