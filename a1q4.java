class a1q4
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    

}
}