package Assignment2;

import java.util.ArrayList;
import java.util.List;

import Assignment2.OrganizationStructure.Employee;

public class TreesEx2 {
  public static void main(String[] args) {
    Employee empK = new Employee("K", "Sales", null);
    List<Employee> drJ = new ArrayList<Employee>(); 
    drJ.add(empK);
    Employee empJ = new Employee("J", "Sales", drJ);
    List<Employee> drI = new ArrayList<Employee>();
    drI.add(empJ);
    Employee empI = new Employee("I", "Director", drI);
    Employee empF = new Employee("F", "Sales", null);
    Employee empG = new Employee("G", "Sales", null);
    Employee empH = new Employee("H", "Sales", null);
    List<Employee> drD = new ArrayList<Employee>();
    
    drD.add(empF);
    drD.add(empG);
    drD.add(empH);
    Employee empD = new Employee("D", "Manager", drD);
    Employee empE = new Employee("E", "Manager", null);
    List<Employee> drB = new ArrayList<Employee>();
    drB.add(empI);
    Employee empB = new Employee("B", "CPO", drB);
    List<Employee> drC = new ArrayList<Employee>();
    drC.add(empD);
    drC.add(empE);
    Employee empC = new Employee("C", "CTO", drC);
    List<Employee> drA = new ArrayList<Employee>();
    drA.add(empB);
    drA.add(empC);
    Employee empA = new Employee("A", "CEO", drA);
    
    OrganizationStructure org = new OrganizationStructure();
    org.ceo = empA;
    org.printLevelByLevel();
    System.out.println();
    System.out.println(org.printNumLevels(org.ceo));
  }
}
