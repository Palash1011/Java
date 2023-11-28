import java.util.Scanner;
public class eligible
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int age=a.nextInt();
if(age>=18)
{
System.out.println("Yes");
}
else
{
int n=18-age;
System.out.println(n);
}
}
}

