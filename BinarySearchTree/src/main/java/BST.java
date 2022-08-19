





public class BST {
private Integer data;
private Integer left;
private  Integer right;

public static class Node{
    int data;
    Node left;
    Node right;
    //return data
    public int getData() {
        return data;
    }
    //return the node to the left of root
    public Node getLeft() {
        return left;
    }
    //return the node to the right of root
    public Node getRight() {
        return right;
    }

    //Node Constructor
    public Node(int data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }
}
    //Just some more getters
    public Integer getData() {
        return data;
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }

    public Node root;

    //Returns the Root
    public Node getRoot() {
        return root;
    }

    public BST(){
        root = null;
    }

    //This will add new node to the binary search tree
    public void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Node current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    //minNode will find out the minimum node
    public Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }





    //Shows the order of traversal.
    public void inorderTraversal(Node node) {

        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);

            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);


        }
    }

    //Just a toString method in-case I need it later
    @Override
    public String toString() {
        return "BST{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                ", root=" + root +
                '}';
    }
}
