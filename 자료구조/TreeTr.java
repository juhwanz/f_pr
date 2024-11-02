package 자료구조;

public class TreeTr {
    int count;

    public TreeTr(){
        count=0;
    }

    public class Node{
        Object data;
        Node left;
        Node right;

        public Node(Object data){
            this.data=data;
            left=null;
            right=null;
        }

        public void addLeft(Node node){
            left = node;
            count++;
        }

        public void addRight(Node node){
            right = node;
            count++;
        }

        public void deleteLeft(){
            left=null;
            count--;
        }

        public void deleteRight(){
            right=null;
            count--;
        }
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.data+" ");
        inOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+" ");
    }
}
