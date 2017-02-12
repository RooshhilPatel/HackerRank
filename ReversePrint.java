  /*Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    
    if(head == null) return;
    
    int size = 0;
    Node temp = head;
     while(temp != null){
       size++;
       temp = temp.next;
    }
    
    int arr[] = new int [size];
    temp = head;
    size = -1;
    while(temp != null){
       size++;
       arr[size] = temp.data;
       temp = temp.next;
    }
    
    while(size != -1){
       System.out.println(arr[size]);
       size--;
    }

}
