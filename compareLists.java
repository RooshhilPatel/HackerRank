 /*class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if(headA == null && headB == null) return 1;
    if((headA == null && headB != null) || (headB == null && headA != null)) return 1;
    
    Node tempA = headA;
    Node tempB = headB;
    int sizeA = 0, sizeB = 0;
    while(tempA != null){
        sizeA++;
        tempA = tempA.next;
    }
    while(tempB != null){
        sizeB++;
        tempB = tempB.next;
    }
    tempA = headA;
    tempB = headB;
    if(sizeA != sizeB) return 0;
    
    while(tempA != null){
        if(tempA.data != tempB.data){
            return 0;
        }
        tempA = tempA.next;
        tempB = tempB.next;
    }
    
  return 1;
}
