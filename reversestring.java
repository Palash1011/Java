import java.util.Scanner;
class reversestring
{
public static void main(String args[])
{
Scanner ch=new Scanner(System.in);
System.out.println("Enter Your Choice\n1.String\n2.Integer");
int c=ch.nextInt();
switch(c)
{
case 1:
String s="TEMPLE";
System.out.println("Original String :"+s);
int l=s.length();
String revs="";
for(int i=0;i<l;i++)
{
char cha=s.charAt(i);
revs=cha+revs;
}
System.out.println("Reversed String :"+revs);
case 2:
int n=12345,sum=0;
System.out.println("Original Number : "+n);
while(n>0)
{
int rem=n%10;
sum=(sum*10)+rem;
n/=10;
}
System.out.println("Reversed Number : "+sum);
}
}
}
