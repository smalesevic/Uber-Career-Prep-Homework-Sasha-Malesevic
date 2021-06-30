package Assignment2;
import java.io.BufferedReader;
import java.io.FileReader;

// The task for Ex 5 was to create the Binary Search Tree and List implementations of the phonebook
// Both of those objects are used in this demo and this is my submission for both questions. 
public class TreesEx6 {
  public static void readAndInsert(String path, PhoneBook phoneBook)
  {
    long startTime = 0;
    long totalTime = 0;
    int counter = 0;
    try
    {
      BufferedReader csvReader = new BufferedReader(new FileReader(path));
      String row = "";
      startTime = System.currentTimeMillis();
      while ((row = csvReader.readLine()) != null) {
          String[] data = row.split(",");
          phoneBook.insert(data[0], Long.valueOf(data[1]));
          counter++; 
          /*
          if(counter > 100000)
          {
            return;
          }
          */
      }
      csvReader.close();  
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
    totalTime = System.currentTimeMillis() - startTime; 
    System.out.println("Insert took " + totalTime + " milliseconds.");

    
  }

  public static void search(String path, PhoneBook phoneBook)
  {
    long startTime = 0;
    long totalTime = 0;
    int counter = 0;
    try
    {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String row = "";
      startTime = System.currentTimeMillis();
      while ((row = reader.readLine()) != null) {
          // do stuff 
          counter++;
          long ret = phoneBook.find(row);
          if(ret == -1)
          {
            System.out.println("Could not find record");
            return;
          }
      }
      reader.close();  
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }


    if(counter != 1000)
    {
      System.out.println("find() was called " + counter + " times. Expected 1000");
      return;
    }
    System.out.println("find() was called " + counter + " times.");
    totalTime = System.currentTimeMillis() - startTime; 
    System.out.println("Search took " + totalTime + " milliseconds.");
    return;
  }
  public static void main(String[] args) {
    
    PhoneBook listPhoneBook = new ListPhoneBook();
    readAndInsert("phoneData.csv", listPhoneBook);
    System.out.println("The size of the Phonebook is " + listPhoneBook.size() + ".");
    search("search.txt", listPhoneBook);
    
    PhoneBook bTreePhoneBook = new BinarySearchTreePhoneBook(); 
    readAndInsert("phoneData.csv", bTreePhoneBook);
    System.out.println("The size of the Phonebook is " + bTreePhoneBook.size() + ".");
    search("search.txt", bTreePhoneBook);
    
  }
}
