import java.util.Scanner;
public class pat1
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int a,b;
for(a=0;a<n;a++) {
for(b=0;b<n;b++){
if((a==1||a==2)&&(b==1||b==2))
{
System.out.print("  ");
}
else
{
System.out.print("* ");}
}
System.out.println();}		
}
}
