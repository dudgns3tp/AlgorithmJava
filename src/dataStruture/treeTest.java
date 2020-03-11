package dataStruture;
class treeNode{
    int data;
    treeNode left;
    treeNode right;
}

class Tree{
    public treeNode root;

    public void setRoot(treeNode node){
        this.root = node;
    }
    public treeNode getRoot(){
        return root;
    }

    public treeNode makeNode(treeNode left, int data, treeNode right){
        treeNode node = new treeNode();
        node.data = data;
        node.left =left;
        node.right = right;
        return node;
    }
    public void inorder(treeNode node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void preorder(treeNode node){
        if(node!=null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(treeNode node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }
}
public class treeTest {
    public static void main(String []args){
        Tree t = new Tree();
        treeNode n4 = t.makeNode(null,4,null);
        treeNode n5 = t.makeNode(null,5,null);
        treeNode n2 = t.makeNode(n4,2,n5);
        treeNode n3 = t.makeNode(null,3,null);
        treeNode n1 = t.makeNode(n2,1,n3);
        t.setRoot(n1);
        t.preorder(n1);
        t.postorder(n1);
        t.inorder(n1);



    }
}
