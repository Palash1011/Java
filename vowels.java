import java.util.Scanner;
import java.lang.String;
public class vowels
{
public static void main(String args[])
{
int i,c=0;
Scanner p=new Scanner(System.in);
String s=p.nextLine();
int l=s.length();
if(s=='a'||'e'||'i'||'o'||'u'||'A'||'E'||'I'||'O'||'U')
{
c+=1;
}
System.out.print(c);
}
}
