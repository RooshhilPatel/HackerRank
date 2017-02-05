

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
        if(root==null)
            return null;
 
        if(root.data==v1 || root.data==v2)
            return root;
 
        Node l = lca(root.left, v1, v2);
        Node r = lca(root.right, v1, v2);
 
        if(l!=null&&r!=null){
            return root;
        }else if(l==null&&r==null){
            return null;
        }else{
            return l==null?r:l;
        }
       
    }
