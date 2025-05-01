class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Sort_012_In_LinkedList {
    // Function to find the length of a loop in the linked list.
    public Node sort(Node head) {
        int zero = 0, one = 0, two = 0;
        Node p = head;
        while (p != null) {
            if (p.data == 0)
                zero++;
            else if (p.data == 1)
                one++;
            else
                two++;
            p = p.next;
        }
        p = head;
        while (zero-- > 0) {
            p.data = 0;
            p = p.next;
        }
        while (one-- > 0) {
            p.data = 1;
            p = p.next;
        }
        while (two-- > 0) {
            p.data = 2;
            p = p.next;
        }
        return head;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(1);

        Sort_012_In_LinkedList sol = new Sort_012_In_LinkedList();
        sol.printList(head);
        Node sorted = sol.sort(head);
        sol.printList(sorted);
    }
}
