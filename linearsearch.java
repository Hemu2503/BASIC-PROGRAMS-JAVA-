import java.util.Scanner;
public class linearsearch
{
	public static void main(String[] args) 
	{
	    int i,key;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Total numbers: ");
		int n =scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the numbers in array: ");
		for (i=0; i<n; i++)
		{
		    array[i]=scanner.nextInt();
		}
		System.out.println("Key value: ");
		key=scanner.nextInt();
		for(i=0;i<n;i++)
		{
		    if(array[i]==key)
		    {
		        System.out.println("The index value where the key present is: "+(i+1));
		        break;
		    }
		}
		if(i==n)
		{
		    System.out.println("Element not found");
		}
	}
}
