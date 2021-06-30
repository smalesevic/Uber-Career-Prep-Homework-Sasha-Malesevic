package Assignment2;

public class BinarySearchTreePhoneBook implements PhoneBook{
  private PhoneBookEntry root = new PhoneBookEntry();
  /**
   * @return The number of entries in this phone book.
   */
  public int size()
  {
    // visit each node
    return size(root);
  }

  public int size(PhoneBookEntry node)
  {
    if(node == null)
    {
      return 0;
    }
    else 
    {
      return (size(node.left) + 1 + size(node.right));
    }
  }

  /**
   * Inserts an entry in this phone book.
   * @param name The name for the entry.
   * @param phoneNumber The phone number for the entry.
   */
  public void insert(String name, long phoneNumber)
  {
    PhoneBookEntry curr = root;
    if(root.number == -1)
    {
      root.name = name;
      root.number = phoneNumber;
      return;
    }
    while(true)
    {
      if(name.compareTo(curr.name) < 0)
      {
        if(curr.left == null)
        {
          curr.left = new PhoneBookEntry(name, phoneNumber);
          return;
        }
        else
        {
          curr = curr.left;
        }
      }
      else if(name.compareTo(curr.name) > 0)
      {
        if(curr.right == null)
        {
          curr.right = new PhoneBookEntry(name, phoneNumber);
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
   * Returns the phone number associated with a name in the phone book.
   * @param name The name to search for.
   * @return The phone number for the entry, or -1 if the name is not present in the phone book.
   */
  public long find(String name)
  {
    // Please implement this method.
    PhoneBookEntry curr = root;
    while(true)
    {
      if(name.equals(curr.name))
      {
        return curr.number;
      }
      if(name.compareTo(curr.name) < 0)
      {
        if(curr.left == null)
        {
          return -1;
        }
        else
        {
          curr = curr.left;
        }
      }
      else if(name.compareTo(curr.name) > 0)
      {
        if(curr.right == null)
        {
          return -1;
        }
        else
        {
          curr = curr.right;
        }
      }
    }
  }

  public static class PhoneBookEntry {
    public long number;
    public String name;
    public PhoneBookEntry left;
    public PhoneBookEntry right;

    public PhoneBookEntry()
    {
      number = -1; 
      name = "0";
      left = right = null;
    }

    public PhoneBookEntry(String key, long value)
    {
      number = value; 
      name = key;
      left = right = null;
    }
    
  }


}
