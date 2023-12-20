import java.util.Scanner;
class simpleinterest
{
public static void main(String args[])
{
int p=10000,t=3;
System.out.println("Principal : "+p+"\nTime : "+t);
Scanner s=new Scanner(System.in);
System.out.println("Senior Citizen('Y'/'N') : ");
String a=s.nextLine();

double amt;
String sc="Y";
if(a.equals(sc))
{
System.out.println("Rate : 4");
amt=(p*t*4)/100;
}
else
{
System.out.println("Rate : 10");
amt=(p*t)/10;
}
System.out.println("Simple Interest : "+amt);
}
}
