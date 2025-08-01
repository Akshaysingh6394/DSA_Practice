

public class diamet2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht) {
            this.diam = diam;
            this.ht = ht;
        }
        
    }
    public static Info diame(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diame(root.left);
        Info righInfo = diame(root.right);
        int diam = Math.max(Math.max(leftInfo.diam , righInfo.diam) , leftInfo.ht+righInfo.ht+1);
        int ht = Math.max(leftInfo.ht, righInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
      
        System.out.println(diame(root).diam);

    }
}
