import java.util.Scanner;
public class ebill2 {
    public static void main(String[] args)
{
Scanner a =new Scanner(System.in);
Scanner b =new Scanner(System.in);
int choice=a.nextInt();
int u=b.nextInt();
double amt=0.0;
switch(choice)
{
case 1:
if(u<=100&&u>0)
{ amt=0;}
else if(u>100&&u<=300)
{amt=(u-100)*2.5;}
else if(u>300&&u<500)
{amt=((u-300)*3.75)+500;}
else
{amt=((u-500)*5.50)+1150;}
case 2:
if(u<=100&&u>0)
{ amt=u*2;}
else if(u>100&&u<=300)
{amt=((u-100)*5)+200;}
else if(u>300&&u<500)
{amt=((u-300)*8.5)+1200;}
else
{amt=((u-500)*10)+2900;}
}
System.out.println(amt);
}
}
