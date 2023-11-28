/**/import java.util.Scanner;
public class tax {
    public static void main(String[] args)
{
Scanner a =new Scanner(System.in);
double net=a.nextInt();
double bo=0;
if(net<250000)
{ bo=0;;}
else if(net>250000&&net<=500000)
{bo=net/20;;}
else if(net>500000&&net<750000)
{bo=net/10;}
else if(net>1000000&&net>750000)
{bo=net*0.15;}
else
{bo=net/5;}
System.out.println("IT : "+bo);
}
}
