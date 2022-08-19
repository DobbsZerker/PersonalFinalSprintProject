import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BSTTest {

    //Testing BST Insertion of data
    @Test
    public void testBSTInsertion() {
        BST BinarySearchTree = new BST();
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(80);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(90);

        Assertions.assertNotNull(BinarySearchTree);

    }

    //Testing GettingLeftOfNodeRoot
    @Test
    public void testBSTGetLeft() {
        BST BinarySearchTree = new BST();
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(80);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(90);

        BinarySearchTree.inorderTraversal(BinarySearchTree.getRoot().left);

    }
    //Testing GettingRightOfNodeRoot
    @Test
    public void testBSTGetRight() {
        BST BinarySearchTree = new BST();
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(80);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(90);

        BinarySearchTree.inorderTraversal(BinarySearchTree.getRoot().right);

    }
    //Testing GettingRoot
    @Test
    public void testBSTGetRoot() {
        BST BinarySearchTree = new BST();
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(80);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(90);

        BinarySearchTree.inorderTraversal(BinarySearchTree.getRoot());

    }
    //Testomg PrderTransversal to ensure data is returned in order
    @Test
    public void testBSTGetInOrderTransversal() {
        BST BinarySearchTree = new BST();
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(80);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(90);

        BinarySearchTree.inorderTraversal(BinarySearchTree.root);

    }





}
