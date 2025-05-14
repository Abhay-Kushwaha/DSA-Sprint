class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Remove_kth_End_Node {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i <= n; i++)
            fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Remove_kth_End_Node s = new Remove_kth_End_Node();
        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30,
                new ListNode(40, new ListNode(50, new ListNode(60, new ListNode(70, new ListNode(80))))))));

        // Remove last 3rd
        ListNode result = s.removeNthFromEnd(head, 3);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}