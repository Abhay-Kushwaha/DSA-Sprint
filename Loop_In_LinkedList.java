class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Loop_In_LinkedList {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node p = head;
        Node q = head;
        if (q.next != null) {
            // p=p.next;
            // q=q.next.next;
            int count = 0;
            while (q != null && q.next != null) {
                p = p.next;
                q = q.next.next;
                if (p == q) {
                    p = p.next;
                    count++;
                    while (p != q) {
                        count++;
                        p = p.next;
                    }
                    return count;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Loop_In_LinkedList sol = new Loop_In_LinkedList();
        int loopLength = sol.countNodesinLoop(head);

        System.out.println("Length of loop is: " + loopLength);
    }
}
