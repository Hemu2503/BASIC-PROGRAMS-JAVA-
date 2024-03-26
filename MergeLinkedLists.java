import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}

public class MergeLinkedLists{
    public Node MergeLinkedlist(Node l1,Node l2)
    {
        Node temp = new Node(0);
        Node current = temp;

        while (l1!=null && l2!= null)
        {
            if(l1.data < l2.data)
            {
                current.next = l1;
                l1 = l1.next;
            }
            else
            {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if(l1!=null)
        {
            current.next = l1;
        }
        else
        {
            current.next = l2;
        }
        return temp.next;
    }


//create Linked List

    public static Node createLL(Scanner sc,int n)
    {
        Node temp = new Node(0);
        Node current = temp;
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            current.next = new Node(data);
            current=current.next;
        }
        return temp.next;
    }


    //Main Function
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in LL1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Elements in LL1: ");
        Node l1 = createLL(sc,n1);

        System.out.println("Enter the number of elements in LL2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements in LL2: ");
        Node l2 = createLL(sc,n2);

        MergeLinkedLists merger = new MergeLinkedLists();
        Node merged = merger.MergeLinkedlist(l1,l2);

        System.out.println("Merged Linked list: ");
        while(merged != null)
        {
            System.out.print(merged.data);
            if(merged.next!=null)
            {
                System.out.print("->");
            }
            merged = merged.next;
        }
        sc.close();

    }
}