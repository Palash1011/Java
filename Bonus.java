import java.util.Scanner;
public class Bonus {
    public static void main(String[] args)
{
Scanner a =new Scanner(System.in);
Scanner b =new Scanner(System.in);
Scanner c =new Scanner(System.in);
Scanner d =new Scanner(System.in);
Scanner e =new Scanner(System.in);
Scanner f =new Scanner(System.in);
int eno=a.nextInt();
String ename=b.nextLine();
String designation=c.nextLine();
int bs=d.nextInt();
int hl=e.nextInt();
int cl=f.nextInt(); 
double hra=bs/5;
double da=bs/5;
double ta=bs;
double ca=bs/20;
double gs=hra+da+ta+ca;
double pf=bs*0.12;
double ded=pf+hl+cl;
double net=gs-ded;
int bo;
System.out.println("Eno :"+eno); 
System.out.println("Ename :"+ename); 
System.out.println("Designation :"+designation);
System.out.println("Hra :"+hra);
System.out.println("Da :"+da);
System.out.println("Ta :"+ta);
System.out.println("Ca :"+ca);
System.out.println("Pf :"+pf);
System.out.println("Hl :"+hl);
System.out.println("Cl :"+cl);
System.out.println("Basic Salary :"+bs);
System.out.println("Gross Salary :"+gs);
System.out.println("Deductions :"+ded);
System.out.println("Net Salary :"+net);
if(net<10000)
{ bo=5;}
else if(net>10000&&net<=30000)
{bo=10;}
else if(net>30000&&net<50000)
{bo=20;}
else
{bo=30;}
System.out.println("Bonus :"+bo+"%");
}
}
