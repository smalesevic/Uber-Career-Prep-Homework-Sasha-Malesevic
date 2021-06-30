package Assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrganizationStructure {
  public Employee ceo;
  //public static Queue<Employee> q = new LinkedList<Employee>();


  public static class Employee {
    public String name;
    public String title;
    public List<Employee> directReports;
    public Employee(String name, String title, List<Employee> dr)
    {
      this.name = name;
      this.title = title;
      this.directReports = dr;
    }
  }

  public void printLevelByLevel() {
    // adds that level to the queue 
    List<List<Employee>> l = new ArrayList<List<Employee>>();
    Queue<Employee> q = new LinkedList<Employee>();
    q.add(ceo);
    int level = 0;
    List<Employee> fl = new ArrayList<Employee>();
    l.add(fl);
    l.get(level).add(ceo);
    level++;
    while(q.size() != 0)
    {
      Employee e = q.peek();
      //System.out.println("Name: "+ e.name + ", Title: " + e.title);
      //System.out.println("Name " + e.name);
      if(e.directReports != null)
      {
        List<Employee> tempList = new ArrayList<Employee>();
        l.add(tempList);
        for(Employee emp: e.directReports)
        {
          l.get(level).add(emp);
          q.add(emp);
          //System.out.println("Name: "+ emp.name + ", Title: " + emp.title);
        }
        level++;
        System.out.println();

      }
      q.remove();
    }

    
    for(int i=0; i<l.size(); i++)
    {
      for(Employee emp: l.get(i))
      {
        System.out.println("Name " + emp.name);
      }
      System.out.println();
    }
    
    
  }
  
  public int printNumLevels(Employee emp) {
    int level = 0; 
    if(emp.directReports != null)
    {
      // evaluate last node first 
      for(int i=0; i<emp.directReports.size(); i++)
      {
        int temp = printNumLevels(emp.directReports.get(i));
        if(temp > level)
        {
          level = temp; 
        }
      }
    }
    
    return level + 1;
  }
  

}
