package leetcode.ListNode;

//
//Code
//        Testcase
//Testcase
//Test Result
//21. Merge Two Sorted Lists
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
//
//
//
//Example 1:
//
//
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:
//
//Input: list1 = [], list2 = []
//Output: []
//Example 3:
//
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//
//Constraints:
//
//The number of nodes in both lists is in the range [0, 50].
//        -100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.


import java.util.Scanner;

class ListNode {
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


public class MergeTwoSortedLists21 {

        public static void main(String[] args) {
//            String input = "list1 = [1,2,4], list2 = [1,3,4]";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ListNode:");
            String input = sc.nextLine();
            String[] parts = input.split(", list2 = ");
            String list1Str = parts[0].replace("list1 = ", "");
            String list2Str = parts[1];

            ListNode list1 = buildList(list1Str);
            ListNode list2 = buildList(list2Str);
            
            ListNode result = mergeTwoLists(list1, list2);
            printList(result);
        }

        static ListNode buildList(String str) {
            str = str.substring(1, str.length() - 1);
            if (str.length() == 0)
                return null;
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



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;


        while(ptr1 != null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            }else{
                dummy.next = ptr2;
                ptr2 = ptr2.next;
            }

            dummy = dummy.next;
        }

        if(ptr1 == null){
            dummy.next = ptr2;
        }else{
            dummy.next = ptr1;
        }
        return ans.next;
    }

}
