/*
  class Node {
     int data;
     Node next;
  }
*/
    
//recursive solution
Node InsertNth(Node head, int data, int position) {
    if (position == 0) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
    head.next = InsertNth(head.next, data, position - 1);
    return head;
}
