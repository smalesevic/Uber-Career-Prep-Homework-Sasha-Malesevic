package Assignment2;

public class Tree {
  public Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public static class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int i, Node l, Node r)
    {
      this.data = i;
      left = l;
      right = r;
    }
  }


  // Left side first starting at root 
  public void print1(Node root)
  {
    System.out.print(" " + root.data + " ");

    if(root.left != null)
    {
      Node newRoot = root.left;
      print1(newRoot);
    }
 
    if(root.right != null)
    {
      Node newRoot = root.right;
      print1(newRoot);

    }

    return;
  }

  // left side first starting at bottom 
  public void print2(Node root)
  {
    Node newRoot = null;

    if(root.left != null)
    {
      newRoot = root.left;
      print2(newRoot);
    }
    
    System.out.print(" " + root.data + " ");

    if(root.right != null)
    {
      newRoot = root.right;
      print2(newRoot);
    }
    return;
  }

  // bottom up
  public void print3(Node root)
  {

    if(root.left != null)
    {
      Node newRoot = root.left;
      print3(newRoot);
    }
 
    if(root.right != null)
    {
      Node newRoot = root.right;
      print3(newRoot);

    }

    System.out.print(" " + root.data + " ");

    return;
  }


  
}

