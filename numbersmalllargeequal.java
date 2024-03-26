import java.sql.SQLOutput;
import java.util.Scanner;

public class numbersmalllargeequal {
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number-1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the number-2: ");
        int n2 = sc.nextInt();

        lesseqgra(n1,n2);
    }
     public static int lesseqgra(int n1,int n2)

    {
        if(n1>n2)
        {
            System.out.println(n1 + " is greater than " + n2);
        }
        else if(n1<n2)
        {
            System.out.println(n1 + " is smaller than " + n2);
        }
        else
        {
            System.out.println(n1 + " is equal to " + n2);
        }

        return n1;
    }




}
