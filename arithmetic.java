import java.util.Scanner;
public class arithmetic
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
int op=c.nextInt();
Scanner d=new Scanner(System.in);
Scanner e=new Scanner(System.in);

int a=d.nextInt();
int b=e.nextInt();
int r=0;
switch(op) {
case 1:
r=a+b;
break;
case 2:
r=a-b;
break;
case 3:
r=a*b;
break;
case 4:
r=a/b;
break;
case 5:
r=a%b;
break;
default:
System.out.println("Enter a choice between 1 to 5");
break;
}
System.out.println("Result : "+r);
}
}
