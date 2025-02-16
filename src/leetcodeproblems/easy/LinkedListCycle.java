package leetcodeproblems.easy;

import leetcodeproblems.ListNode;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        ListNode current = head;

        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }


        return true;
    }

}
