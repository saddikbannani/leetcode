/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * Detects if a linked list contains a cycle.
     * Uses a HashSet to track visited nodes.
     * 
     * @param head The head of the linked list
     * @return true if the linked list contains a cycle, false otherwise
     */
    public boolean hasCycle(ListNode head) {
        // HashSet to store visited nodes
        Set<ListNode> visitedNodes = new HashSet<>();
      
        // Traverse the linked list
        ListNode currentNode = head;
        while (currentNode != null) {
            // If add() returns false, the node was already in the set (cycle detected)
            if (!visitedNodes.add(currentNode)) {
                return true;
            }
            // Move to the next node
            currentNode = currentNode.next;
        }
      
        // No cycle found after traversing the entire list
        return false;
    }
}