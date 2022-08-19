


import java.util.Objects;
import java.util.Scanner;


public class BinarySearchTreeDemo {


    public static void main(String[] args) {

        BST bt = new BST();
        BST bt2 = new BST();
        //Just a default BST entry
        //Add nodes to the binary tree
        bt.insert(70);
        bt.insert(50);
        bt.insert(90);
        bt.insert(80);
        bt.insert(30);
        bt.insert(110);

        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        bt.inorderTraversal(bt.root);
        System.out.println();
        System.out.println("Left: ");
        bt.inorderTraversal(bt.getRoot().left);
        System.out.println();
        System.out.println("Right: ");
        bt.inorderTraversal(bt.getRoot().right);
        System.out.println();


        Scanner dataEntry = new Scanner(System.in);

        System.out.println("Please Enter your Choice");
        System.out.println("1. Enter Numbers for Binary Search Tree: ");
        System.out.println("2. Print Binary Search Tree");
            //Created Simple loop for manual Entry.
        int choiceInt = dataEntry.nextInt();
        if (choiceInt == 1){
            while (choiceInt == 1)
            {
                System.out.println("Enter your Numbers for Binary Search Tree: ");

                int data = dataEntry.nextInt();
                 bt2.insert(data);

                System.out.println("Type 1 to continue adding numbers");
                System.out.println("Type 2 to Print the Tree");
                int choiceInt2 = dataEntry.nextInt();
                if(choiceInt2 == 2){
                   choiceInt = 2;
                }



            }


        if(choiceInt == 2){
            System.out.println("Binary search tree after insertion:");
            //Displays the binary tree entered by User
            bt2.inorderTraversal(bt2.root);
            System.out.println();
            System.out.println("Left: ");
            bt2.inorderTraversal(bt2.getRoot().left);
            System.out.println();
            System.out.println("Right: ");
            bt2.inorderTraversal(bt2.getRoot().right);
            System.out.println();
        }
        }






        }

    }
