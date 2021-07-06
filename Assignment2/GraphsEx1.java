package Assignment2;


import Assignment2.GraphWithAdjacencyList.GraphNode;
public class GraphsEx1 {
  public static void main(String[] args) {
    GraphWithAdjacencyList g = new GraphWithAdjacencyList();
    System.out.println("Adding nodes 1, 2");
    g.addNode(1);
    g.addNode(2);
    g.print();
    System.out.println("Adding edge between 1, 2");
    g.addEdge(1,2);
    g.print();
    System.out.println("Removing edge between 1, 2");
    g.removeEdge(1,2);
    g.print();

  }


}
