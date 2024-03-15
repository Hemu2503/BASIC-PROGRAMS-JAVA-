import java.util.Scanner;

public class palindrome
{
    public static int palindrome(int n)
    {
        int reversed=0;
        while(n>0)
        {
            reversed = reversed*10+n%10;
            n/=10;
        }
        return reversed;
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = palindrome(n);
        System.out.println("the reveresed number is: "+result);

        if(n==result)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }

}
