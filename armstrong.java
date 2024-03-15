import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean result = checkArmstrong(n);

        if (result) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }

        sc.close();
    }

    static boolean checkArmstrong(int n)
    {
        int orgNum = n;
        int noOfDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, noOfDigits);
            n = n / 10;
        }

        return orgNum == sum;
    }
}
