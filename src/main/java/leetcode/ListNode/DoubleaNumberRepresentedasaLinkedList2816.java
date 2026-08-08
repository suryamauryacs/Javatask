package leetcode.ListNode;

import java.util.Scanner;
//You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
//
//Return the head of the linked list after doubling it.
//
//
//
//Example 1:
//
//
//Input: head = [1,8,9]
//Output: [3,7,8]
//Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
//Example 2:
//
//
//Input: head = [9,9,9]
//Output: [1,9,9,8]
//Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998.
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 104]
//0 <= Node.val <= 9
//The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.


public class DoubleaNumberRepresentedasaLinkedList2816 {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Node : ");
        String input = sc.nextLine();

        String str = input.replace("head = ","");

        ListNode head = buildList(str);

        doubleIt(head);

    }


    static ListNode buildList(String str){
        str = str.substring(1, str.length()-1);

        String[] nums = str.split(",");

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(String num : nums){
            curr.next = new ListNode(Integer.parseInt(num.trim()));
            curr = curr.next;
        }

        return dummy.next;
    }

    static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val +" ");
            head = head.next;
        }
    }

    public ListNode doubleIt(ListNode head){

    }
}
