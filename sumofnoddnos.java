import java.util.Scanner;
public class sumofnoddnos
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=0,i=1;
while(i<=n)
{
if(i%2==1)
{
sum+=i;
}
i++;
}
System.out.println(sum);
}
}


