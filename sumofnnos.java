import java.util.Scanner;
public class sumofnnos
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int sum=0,i=1;
//using while loop
/*while(i<=n)
{
sum+=i;
i++;
}*/
//using do while loop
/*do
{
sum+=i;
i++;
}
while(i<=n);*/
//using for loop
for(i=1;i<=n;i++)
{
sum+=i;
}
System.out.println(sum);
}
}


