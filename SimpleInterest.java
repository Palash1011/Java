import java.util.scanner;
public class SimpleInterest
{
public static void main(String args[]);
{
Scanner a =new Scanner(System.in);
Scanner b =new Scanner(System.in);
Scanner c =new Scanner(System.in);
int P=a.nextInt();
int R=b.nextInt();
int T=c.nextInt();
float I=(P*R*T)/100;
System.out.println("SI"+I);
}
}
