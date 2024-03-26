import java.util.Scanner;

class LNode{
    int data;
    LNode next;


    public LNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist
{
    private static LNode head;

    public Linkedlist()
    {
        this.head = null;
    }
    public static void insert(int data)
    {
        LNode newnode = new LNode(data);
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            LNode temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println("\n" + data + " is inserted into linked list\n");
    }
    public static void delete(int data)
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty");
            return;

        }
        if(head.data==data)
        {
            System.out.println(data + " is deleted from linked list");
        }

        LNode prev = null;
        LNode current = head;

        while(current!=null && current.data!=data)
        {
            prev = current;
            current = current.next;
        }
        if(current == null)
        {
            System.out.println(data + " is not found in linkedlist");
        }
        else
        {
            prev.next = current.next;
            System.out.println(data + " is deleted from linked list");

        }

    }
    public static void display(){
        if(head==null)
        {
            System.out.println("Linkedlist is empty");
        }
        else{
            LNode temp = head;
            System.out.println("\nLinked List: ");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
public class insertlinkedlist{
    public static void main(String[] args)
    {

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            System.out.println("1.  Insert: ");
            System.out.println("2. Delete: ");
            System.out.println("3. Display: ");
            System.out.println("4. exiting: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be inserted: ");
                    int insertelement = sc.nextInt();
                    Linkedlist.insert(insertelement);
                    break;
                case 2:
                    System.out.println("Enter the element to be deleted: ");
                    int deleteelement = sc.nextInt();
                    Linkedlist.delete(deleteelement);
                    break;
                case 3:
                    Linkedlist.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);


                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
