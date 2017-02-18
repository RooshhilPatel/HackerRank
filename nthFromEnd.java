/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int size = 0;
    Node temp = head;
    while(temp != null){
        size++;
        temp = temp.next;
    }
    
    int []arr = new int[size];
    temp = head;
    
    while(temp != null){
        size--;
        arr[size] = temp.data;
        temp = temp.next;
    }
    
    return arr[n];
    
}
