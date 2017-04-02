/**
 ** Definition for singly-linked list.
 ** class ListNode {
 **     int val;
 **     ListNode next;
 **     ListNode(int x) {
 **         val = x;
 **         next = null;
 **     }
 ** }
 **/
public class Solution {
    public boolean hasCycle(ListNode head) {
        //declare a set to save all visited nodes
        //visit each node in the linked list, 
        //if node's next is already in the set, return true
        //else, add node to set, node = node.next.
        //base case?
        if(head == null) return false;
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode node = head;
        while(node!=null){
            if(set.contains(node.next))
                return true;
            set.add(node);
            node = node.next;
        }
        return false;
    }
}
