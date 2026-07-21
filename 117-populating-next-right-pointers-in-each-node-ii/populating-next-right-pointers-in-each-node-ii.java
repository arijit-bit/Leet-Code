/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node ans = root;
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                Node curr = q.poll();
                
                if(!q.isEmpty()) curr.next = q.peek();
                if(q.isEmpty()) curr.next = null;
                if (i== len-1) curr.next = null;
                if(curr.left!= null) q.offer(curr.left);
                if(curr.right!= null) q.offer(curr.right);
            }
        }
        return ans;
    }
}