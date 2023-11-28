import java.util.Scanner;
public class Total {
    public static void main(String[] args) {
Scanner a =new Scanner(System.in);
Scanner b =new Scanner(System.in);
        Scanner c =new Scanner(System.in);
        Scanner d =new Scanner(System.in);
        Scanner e =new Scanner(System.in);
        Scanner f =new Scanner(System.in);
        Scanner g =new Scanner(System.in);
        int reg=a.nextInt();
String n=b.nextLine();
int m3=c.nextInt();
int m1=d.nextInt();
int m2=e.nextInt();
int m4=f.nextInt();
int m5=g.nextInt();
int t=m1+m2+m3+m4+m5;
float avg1=0.00f;
if(m1<0||m2<0||m3<0||m4<0||m5<0)
{System.out.println("Entered marks must be positive");}
else if(m1>100||m2>100||m3>100||m4>100||m5>100)
{System.out.println("Entered marks must be  less than  100 to get Student Avg");}
else if(m1<50||m2<50||m3<50||m4<50||m5<50)
{System.out.println("Student Failed in Sub cannot calculate average");
}
else{
avg1=t/5;
System.out.println("Student Reg No"+reg); 
System.out.println("Student Name"+n); 
System.out.println("Student Total Marks"+t);
System.out.println("Student Avg Marks"+avg1); 
if(avg1>=90)
{System.out.println("A+");}
else if(avg1>=80&&avg1<90)
{System.out.println("A");}
else if(avg1>=70&&avg1<80)
{System.out.println("B");}
else if(avg1>=60&&avg1<70)
{System.out.println("c");}
else
{System.out.println("D");}
 }
}
}
