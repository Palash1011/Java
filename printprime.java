public class printprime
{
public static void main(String args[])
{
System.out.println("prime nos ");
int count,i,j;
for(i=100;i<=200;i++){
count = 0; 
for(j=2;j<=i/2;j++){
if(i%j== 0){
count++; 
break;
}
}
if(count==0){
System.out.println(i);
}
}
System.out.println("Composite ");
for(i=100;i<=200;i++){
count = 0; 
for(j=2;j<=i/2;j++){
if(i%j== 0){
count++; 
break;
}
}
if(count==1){
System.out.println(i);
}
}
}
}
