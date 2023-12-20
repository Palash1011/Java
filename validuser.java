import java.util.*;
class validuser
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Username : ");
String s=sc.nextLine();
String p="Palash123";
if(s.equals(p))
{
System.out.println("The Entered Username is Valid.");
}
else
{
System.out.println("The Entered Username is Not Valid.");
}
}
}

