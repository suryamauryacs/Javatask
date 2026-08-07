package leetcode.ListNode;

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


public class MergeTwoSortedLists21 {

        public static void main(String[] args) {

            String input = "list1 = [1,2,4], list2 = [1,3,4]";

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
