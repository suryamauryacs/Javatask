package leetcode.ListNode;

import java.util.Scanner;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
//
//
//Constraints:
//
//The number of nodes in each linked list is in the range [1, 100].
//0 <= Node.val <= 9
//It is guaranteed that the list represents a number that does not have leading zeros.



public class AddTwoNumbers2 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the NodeList");
        String input = sc.nextLine();

        String[] parts = input.split(", l2 = ");
        String l1str = parts[0].replace("l1 = ","");
        String l2str = parts[1];

        ListNode l1 = buildList(l1str);
        ListNode l2 = buildList(l2str);


        ListNode res = addTwoNumbers(l1, l2);
        printList(res);
    }

    static void printList(ListNode head){
        System.out.print("[");
        while (head !=  null){
            System.out.print(head.val);

            if(head.next != null){
                System.out.print(", ");
            }

            head = head.next;
        }

        System.out.println("]");
    }



    static ListNode buildList(String str){
        str = str.substring(1, str.length()-1);

        if(str.length() == 0){
            return null;
        }

        String[] nums = str.split(",");

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(String n : nums){
            curr.next = new ListNode(Integer.parseInt(n.trim()));
            curr = curr.next;
        }

        return dummy.next;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        int carry = 0;

        while(ptr1 != null || ptr2 != null){
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;
            int d = sum%10;
            carry = sum/10;

            ListNode temp = new ListNode(d);

            dummy.next = temp;
            dummy = dummy.next;

            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;


        }

        if(carry > 0){
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }

        return ans.next;
    }



}
