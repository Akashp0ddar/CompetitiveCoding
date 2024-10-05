package leetcodeproblems.medium;

import leetcodeproblems.ListNode;
import leetcodeproblems.utils.Utils;

public class AddTwoNumbers {

    //https://leetcode.com/problems/add-two-numbers/

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        Utils.printLinkedList(addTwoNumbers(l1, l2));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstCurrentNode = l1;
        ListNode secondCurrentNode = l2;

        StringBuilder firstList = new StringBuilder();
        StringBuilder secondList = new StringBuilder();


        while (firstCurrentNode != null) {
            firstList.append(firstCurrentNode.val);
            firstCurrentNode = firstCurrentNode.next;
        }


        while (secondCurrentNode != null) {
            secondList.append(secondCurrentNode.val);
            secondCurrentNode = secondCurrentNode.next;
        }


        int finalResult = Integer.parseInt(firstList.reverse().toString()) + Integer.parseInt(secondList.reverse().toString());

        firstList.replace(0, firstList.length(), String.valueOf(finalResult));


        ListNode head = null;
        ListNode tail = null;


        for (int i = firstList.length() - 1; i >= 0; i--) {

            int numberToInsert = Integer.parseInt(String.valueOf(firstList.charAt(i)));

            ListNode newNode = new ListNode(numberToInsert);

            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }


        return head;
    }
}
