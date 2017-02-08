/*
  class Node {
     int data;
     Node next;
  }
*/

Node Insert(Node head,int x) {
  Node temp = new Node();
  temp.data = x;
    
    if(head == null){
        temp.next = null;
        return temp;
    }

    temp.next = head;
    return temp;
}
