package Assignment2;

import Assignment2.Tree.Node;

public class TreeEx1 {
  public static void main(String[] args) {
    Node leftChild = new Node(6, null, null);
    Node rightChild = new Node(3, null, null);
    Node left = new Node(7, null, null);
    Node right = new Node(17, leftChild, rightChild);
    Node root = new Node(1, left, right);
    Tree tree = new Tree(root);
    System.out.println("Tree 1: ");
    tree.print1(tree.root);
    System.out.println();
    System.out.println("Tree 2: ");
    tree.print2(tree.root);
    System.out.println();
    System.out.println("Tree 3: ");
    tree.print3(tree.root);
  }
}
