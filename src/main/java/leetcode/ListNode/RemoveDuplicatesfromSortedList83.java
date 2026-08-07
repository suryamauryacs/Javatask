package leetcode.ListNode;

import java.util.Scanner;
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//
//
//Example 1:
//
//
//Input: head = [1,1,2]
//Output: [1,2]
//Example 2:
//
//
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
//
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 300].
//-100 <= Node.val <= 100
//The list is guaranteed to be sorted in ascending order.




public class RemoveDuplicatesfromSortedList83 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Node of Array : ");
        String input = sc.nextLine();

        String headStr = input.replace("head = ", "");

        ListNode head = buildList(headStr);

        ListNode result = deleteDuplicates(head);

        printList(result);

        sc.close();
    }

    static ListNode buildList(String str) {
        str = str.substring(1, str.length() - 1);

        if (str.length() == 0) {
            return null;
        }

        String[] nums = str.split(",");

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (String num : nums) {
            curr.next = new ListNode(Integer.parseInt(num.trim()));
            curr = curr.next;
        }

        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next; // remove duplicate
            } else {
                current = current.next;
            }
        }

        return head;
    }
}