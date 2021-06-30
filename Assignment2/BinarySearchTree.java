package Assignment2;

public class BinarySearchTree {
  public Node root;

  /**
   * Inserts a key into this binary search tree.
   * If there are n nodes in the tree, then the average runtime of this method should be log(n).
   * 
   * @param key The key to insert.
   */
  public void insert(int key) {
    // Please implement this method.
    Node curr = root;
    while(true)
    {
      if(key < curr.key)
      {
        if(curr.left == null)
        {
          curr.left = new Node();
          curr.left.key = key;
          System.out.println("Added node to the left of: " + curr.key);
          return;
        }
        else
        {
          curr = curr.left;
        }
      }
      else if(key > curr.key)
      {
        if(curr.right == null)
        {
          curr.right = new Node();
          curr.right.key = key;
          System.out.println("Added node to the right of: " + curr.key);
          return;
        }
        else
        {
          curr = curr.right;
        }
      }
    }
  }

  /**
   * Checks whether or not a key exists in this binary search tree.
   * If there are n nodes in the tree, then the average runtime of this method should be log(n).
   * 
   * @param key The key to check for.
   * @return true if the key is present in this binary search tree, false otherwise.
   */
  public boolean find(int key) {
    // Please implement this method.
    Node curr = root;
    while(true)
    {
      if(key == curr.key)
      {
        return true;
      }
      if(key < curr.key)
      {
        if(curr.left == null)
        {
          return false;
        }
        else
        {
          curr = curr.left;
        }
      }
      else if(key > curr.key)
      {
        if(curr.right == null)
        {
          return false;
        }
        else
        {
          curr = curr.right;
        }
      }
    }
  }

  public static class Node {
    public long key;
    public String value;
    public Node left;
    public Node right;
    
  }

  // Demo for Ex. 4 
}
