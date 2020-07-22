import java.util.*;
class a1q20
{
public static void main(String args[])
{
int i,j,n,fact,sign=-1;
float x,p,sum=0;
System.out.println("Enter the value of x:");
Scanner s=new Scanner(System.in);
x=s.nextInt();
System.out.println("Enter the value of n:");
n=s.nextInt();
for(i=2;i<=n;i+=2)
{p=1;
fact=1;
for(j=1;j<=i;j++)
{
p=p*x;
fact=fact*j;
}
sum+=sign*p/fact;
sign=-1*sign;
}
System.out.println("cos "+x+"="+(1+sum));
}
}