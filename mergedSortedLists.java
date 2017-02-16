/* class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    if(headA == null) return headB;
    if(headB == null) return headA;
    
    Node merged = new Node();
        
    if(headA.data <= headB.data){
        merged = headA;
        merged.next = MergeLists(headA.next, headB);
    }else{
     merged = headB;
     merged.next = MergeLists(headA, headB.next);
  }
    
    return merged;
}
