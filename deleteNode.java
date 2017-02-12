  /*class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    
    if (head == null) return head;
    
    Node temp = head;
    if (position == 0)
    {
        head = temp.next;
        return head;
    }

    for (int i=0; temp!=null && i<position-1; i++){
        temp = temp.next;
    }

    Node next = temp.next.next;
    temp.next = next;
    
    return head;
}
