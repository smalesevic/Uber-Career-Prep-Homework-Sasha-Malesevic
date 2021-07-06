package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class GraphWithAdjacencyList {
  public static class GraphNode {
    public int data;
    GraphNode(int data) {
      this.data = data;
    }
  }
  
  private Map<GraphNode, List<GraphNode>> adjNodes = new HashMap<GraphNode, List<GraphNode>>();

  // Adds a new node to the graph. 
  void addNode(int key) 
  {
    //List<GraphNode> list = Collections.<GraphNode>emptyList();
    //GraphNode newNode = new GraphNode(key);
    //adjNodes.put(newNode, list);

    // check that key does not exist 
    if(adjNodes.get(new GraphNode(key)) != null)
    {
      return;
    }

    // add node 
    adjNodes.put(new GraphNode(key), new ArrayList<GraphNode>());


  }
  // Removes the node from the graph. 
  void removeNode(int key)
  {
    for(Map.Entry<GraphNode,List<GraphNode>> node : adjNodes.entrySet())
    {
      // remove entry 
      if(node.getKey().data == key)
      {
        adjNodes.remove(node);
      }
      // need to remove it from lists 
    }
  } 
  //Adds an edge between node1 and node2
  void addEdge(int node1, int node2)
  {
    /*
    GraphNode toAdd = new GraphNode(node2);
    List<GraphNode> list = adjNodes.get(new GraphNode(node1));
    list.add(toAdd);
    System.out.println("Found it? : " + adjNodes.get(new GraphNode(node1)));
    */

    for(Map.Entry<GraphNode,List<GraphNode>> node : adjNodes.entrySet())
    {
      if(node.getKey().data == node1)
      {
        List<GraphNode> temp = node.getValue(); 
        temp.add(new GraphNode(node2));
        node.setValue(temp);
      }
      if(node.getKey().data == node2)
      {
        List<GraphNode> temp = node.getValue(); 
        temp.add(new GraphNode(node1));
        node.setValue(temp);
      }
    }
  }
  //Removes an edge between node1 and node2. 
  void removeEdge(int node1, int node2) 
  {
    
    // for each node in the map
    for(Map.Entry<GraphNode,List<GraphNode>> node : adjNodes.entrySet())
    {
      // if node == node1
      if(node.getKey().data == node1)
      {
        node.getValue().removeIf(n -> (n.data == node2));
      }
      else if(node.getKey().data == node2)
      {
        node.getValue().removeIf(n -> (n.data == node1));
      }
    }
    
  }
  //Get nodes that are connected to the node represented by ‘key’.
  List<GraphNode> getAdjNodes(int key) 
  {
    // for each node in the map
    for(Map.Entry<GraphNode,List<GraphNode>> node : adjNodes.entrySet())
    {
      // if node == key return the adjacency list
      if(node.getKey().data == key)
      {
        return node.getValue();
      }
    }

    return null;
  }
  void printAdjNodes(int key)
  {
    List<GraphNode> list = getAdjNodes(key);
    for(GraphNode node : list)
    {
      System.out.print(node.data + " ");
    }
  }

  void print()
  {
    for(Map.Entry<GraphNode,List<GraphNode>> node : adjNodes.entrySet())
    {
      int key = node.getKey().data;
      System.out.print("Node " + key + ": ");
      printAdjNodes(node.getKey().data);
      System.out.println();
    }
  }
}
