import java.lang.Math;
public class exone
{
public static void main(String args[])
{
int a=1,b=2,c=3,x=3,y=-4,z=2,x1=4,x2=2,y1=3,y2=3;
float a1=0.00f,a2=0.00f,a3=0.00f,a4=0.00f,a5=0.00f;
a1=(((a*b)/c)+((c*b)/a)+((a*c)/b));
a2=(((a*a*b)/c)+((c*b*b)/a)-((a*c*c)/b));
a3=((b*b)-(4*a*c))/2*a;
a4=((x+y)+(y+z)-(z+x))/((x*x)+(y*y)+(z*z));
a5=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
System.out.println(Math.sqrt(a5));
}
}
