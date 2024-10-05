package leetcodeproblems.leetcodedaily;

import leetcodeproblems.ListNode;

public class DeleteNodeFromLinkedListInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

//        printLinkedList(modifiedList(arr, head));

//        modifiedList(arr,head);
        printLinkedList(modifiedList(arr, head));
    }


    public static ListNode modifiedList(int[] nums, ListNode head) {


//        ListNode currentNode = head;
//        for (int num : nums) {
//
//            while (currentNode != null) {
//
//                if (num == currentNode.val) {
//                    System.out.println(currentNode.val);
//                    currentNode = currentNode.next;
//                }
//            }
//
//        }


        ListNode resultNode;
        ListNode currentNode = head;


        for (int num : nums) {

            while (currentNode != null) {
                if (num != currentNode.val) {
                    resultNode = new ListNode(num);
                    resultNode.next = new ListNode();
                } else {

                    currentNode = currentNode.next;
                }
            }

        }


        return head;
    }


    private static void printLinkedList(ListNode head) {
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
