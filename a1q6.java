public class a1q6
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int reverse=0;
while(num!=0)
{
int digit=num%10;
reverse=reverse*10+digit;
num/=10;
}
System.out.println("Reversed number: " +reverse);
}
}