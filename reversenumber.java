import java.util.Scanner;

public class reversenumber
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num!=0)
        {
            int rem = num%10;
            reversed = reversed*10 + rem;
            num /=10;
        }
        System.out.println("The reversed number is: "+reversed);
    }
}