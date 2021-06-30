package Assignment2;

public interface PhoneBook {
  /**
   * @return The number of entries in this phone book.
   */
  public int size();

  /**
   * Inserts an entry in this phone book.
   * @param name The name for the entry.
   * @param phoneNumber The phone number for the entry.
   */
  public void insert(String name, long phoneNumber);

  /**
   * Returns the phone number associated with a name in the phone book.
   * @param name The name to search for.
   * @return The phone number for the entry, or -1 if the name is not present in the phone book.
   */
  public long find(String name);
}

