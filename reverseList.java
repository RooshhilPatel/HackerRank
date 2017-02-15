/*class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {

    if (head == null || head.next == null) {
        return head;
    }
    Node temp = head;
    Node previousNode = null;
    Node nextNode = null;

    while (temp != null) {
        nextNode = temp.next;
        temp.next = previousNode;
        previousNode = temp;
        temp = nextNode;
    }
    return previousNode;
}
