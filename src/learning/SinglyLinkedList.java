package learning;


import leetcodeproblems.ListNode;

public class SinglyLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        insertElementInLinkedList(40, n1, 2);
        printLinkedList(n1);
        deleteElementInLinkedList(n1, 2);
        printLinkedList(n1);

    }


    private static void printLinkedList(ListNode head) {
        ListNode currentNode = head;
        int counter = 0;

        while (currentNode != null) {
            counter++;
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println(counter);
    }


    private static void insertElementInLinkedList(int data, ListNode head, int position) {
        ListNode dataToAdd = new ListNode(data);

        if (position == 0) {
            dataToAdd.next = head;
            head = dataToAdd;
        }

        ListNode prev = head;

        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }

        dataToAdd.next = prev.next;
        prev.next = dataToAdd;

    }


    private static void deleteElementInLinkedList(ListNode head, int position) {

        if (position == 0)
            head = head.next;


        ListNode prev = head;

        for (int i = 0; i < position - 1; i++)
            prev = prev.next;


        prev.next = prev.next.next;
    }

}
