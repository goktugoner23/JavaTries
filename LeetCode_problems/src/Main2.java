//https://leetcode.com/problems/rotate-list/
//Given the head of a linked list, rotate the list to the right by k places.
//Example 1:
//
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]
//Example 2:
//
//Input: head = [0,1,2], k = 4
//Output: [2,0,1]
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 500].
//-100 <= Node.val <= 100
//0 <= k <= 2 * 10^9




public class Main2 {
    public ListNode rotateRight(ListNode head, int k)
    {
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        while(k>0){
            rotateRight(head, k);
            k--;
        }
        return null;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
