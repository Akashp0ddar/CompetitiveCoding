package leetcodeproblems.utils;

import leetcodeproblems.ListNode;

public class Utils {

    public static void printLinkedList(ListNode head) {
        ListNode currentNode = head;
        int counter = 0;

        while (currentNode != null) {
            counter++;
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("Size of the linkedList");
        System.out.println(counter);
    }
}
