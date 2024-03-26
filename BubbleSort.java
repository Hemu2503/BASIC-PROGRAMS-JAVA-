import java.util.Scanner;
public class BubbleSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        printarray(arr);
        bubblesort(arr);
        System.out.println("Array after sortng: ");
        printarray(arr);

        sc.close();
    }
    static void bubblesort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j< (n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}