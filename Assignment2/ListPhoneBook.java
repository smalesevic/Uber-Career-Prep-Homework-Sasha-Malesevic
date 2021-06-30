package Assignment2;

import java.util.ArrayList;

public class ListPhoneBook implements PhoneBook{
  private ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
  /**
   * @return The number of entries in this phone book.
   */
  public int size()
  {
    return phoneBook.size();
  }

  /**
   * Inserts an entry in this phone book.
   * @param name The name for the entry.
   * @param phoneNumber The phone number for the entry.
   */
  public void insert(String name, long phoneNumber)
  {
    PhoneBookEntry newEntry = new PhoneBookEntry(name, phoneNumber);
    phoneBook.add(newEntry);
  }

  /**
   * Returns the phone number associated with a name in the phone book.
   * @param name The name to search for.
   * @return The phone number for the entry, or -1 if the name is not present in the phone book.
   */
  public long find(String name)
  {
    for(PhoneBookEntry pbe: phoneBook)
    {
      if(pbe.name.equals(name))
      {
        return pbe.phoneNumber;
      }
    }
    return 0;
  }

  public class PhoneBookEntry {
    public long phoneNumber;
    public String name;

    public PhoneBookEntry(String name, long phoneNum)
    {
      this.name = name;
      this.phoneNumber = phoneNum;
    }
  }

  public static void main(String[] args) {
    
  }
}
