import java.util.*;
class a1q19
{
public static void main(String args[])
{
int i,j,n,fact,sign=-1;
float x, p,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of x : ");
x=s.nextInt();
System.out.println("Enter the value of n : ");
n=s.nextInt();
for(i=1;i<=n;i+=2)
{ 
p=1;
fact=1;
for(j=1;j<=i;j++)
{
p=p*x;
fact=fact*j;
}
sign=-1*sign;
sum+=sign*p/fact;
}
System.out.println("sin "+x+"="+sum);
}
}