import java.util.HashSet;
import java.util.Set;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 20/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class IntersectionOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;
    }

    ;

    public static int length(Node head) {
        if (head == null)
            return 0;

        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static int getIntersectionNode(Node head1, Node head2) {
        int length1 = length(head1);
        int length2 = length(head2);
        int diff;

        diff = Math.abs(length1 - length2);

        if (length1 > length2)
            while (diff-- > 0)
                head1 = head1.next;
        else
            while (diff-- > 0)
                head2 = head2.next;

        while (head1 != null) {
            if (head1.equals(head2))
                return head1.data;
            head1 = head1.next;
            head2 = head2.next;
        }
        return -1;
    }

    public static Node getIntersectionNodeUsingPointers(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Node pointer1 = head1;
        Node pointer2 = head2;

        while (pointer1 != pointer2) {
            if (pointer1 == null)
                pointer1 = head2;
            else
                pointer1 = pointer1.next;

            if (pointer2 == null)
                pointer2 = head1;
            else
                pointer2 = pointer2.next;
        }

        return pointer1;
    }

    public static Node getIntersectionNodeUsingHashTable(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Set<Node> nodeSet = new HashSet<>();

        while (head1 != null) {
            nodeSet.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (nodeSet.contains(head2))
                return head2;
            head2 = head2.next;
        }

        return null;
    }

    public static void main(String args[]) {
        Node newNode;
        Node head1 = new Node();
        head1.data = 10;
        Node head2 = new Node();
        head2.data = 3;
        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;
        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;
        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;
        head1.next.next.next = null;

        // Print the intersection node
        // System.out.print(getIntersectionNode(head1, head2));

        System.out.println(getIntersectionNodeUsingHashTable(head1, head2).data);
    }
}
