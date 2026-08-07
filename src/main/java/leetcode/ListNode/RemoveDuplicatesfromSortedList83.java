package leetcode.ListNode;

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


public class RemoveDuplicatesfromSortedList83 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Node of Array : ");
        String input = sc.nextLine();
//                String input = "head = [1,1,2,3,3]";

        String headStr = input.replace("head = ", "");
        ListNode head = buildList(headStr);
        ListNode result = deleteDuplicates(head);
        printList(result);
        }

    static ListNode buildList(String str) {
        str = str.substring(1, str.length() - 1);
        if(str.length() == 0)
            return null;
        String[] nums = str.split(",");
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(String num : nums) {
            curr.next = new ListNode(Integer.parseInt(num));
            curr = curr.next;
        }
        return dummy.next;
    }


    static void printList(ListNode head) {

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}



public static ListNode deleteDuplicates(ListNode head) {
    if(head == null){
        return head;
    }
    ListNode dummy = new ListNode(head.val);
    ListNode ans = dummy;
    ListNode ptr = head.next;

    while(ptr != null){
        if(ptr.val != dummy.val){
            ListNode temp = new ListNode(ptr.val);
            dummy.next = temp;
            dummy = dummy.next;
        }

        ptr = ptr.next;
    }

    return ans;
}


