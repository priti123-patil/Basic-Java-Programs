class a1q5
{
public static void main(String args[])
{
int m = Integer.parseInt(args[0]);
int n = Integer.parseInt(args[1]);
int temp=n;
long result = 1;
while (n != 0)
 {
  result *= m;
  --n;
 }
System.out.println(+m+"^" +temp+ "=" + result);
}
}