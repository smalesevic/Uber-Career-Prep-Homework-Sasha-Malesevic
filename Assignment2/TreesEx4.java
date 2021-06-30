package Assignment2;

import Assignment2.BinarySearchTree.Node;

public class TreesEx4 {
  public static void main(String[] args) {
    Node root = new Node(); 
    root.key = 16; 
    Node newLeft = new Node(); 
    newLeft.key = 10; 
    Node newRight = new Node();
    newRight.key = 21;
    root.left = newLeft;
    root.right = newRight;
    BinarySearchTree bTree = new BinarySearchTree();
    bTree.root = root;
    bTree.insert(7);
    System.out.println(bTree.find(21));
    System.out.println();
  }
}
