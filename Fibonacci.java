import java.util.Scanner;

public class Fibonacci
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of num: ");
        int n = sc.nextInt();
        System.out.println("fibonacci series is: ");
        fibonacci(n);
    }
    public static void fibonacci(int n)
    {
        int num1 = 0,num2=1;
        for(int i=0;i<=n;i++)
        {
            System.out.print(num1 + ",");
            int num3 = num1+num2;
            int temp = num1;
            num1 = num2;
            num2 = num3;
        }
    }
}