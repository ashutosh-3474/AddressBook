import java.util.HashMap;
import java.util.Map;

public class AddressBookCollection {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String addressBookName) {
        addressBooks.put(addressBookName, new AddressBook());
        System.out.println(addressBookName + " added to the addressbook collection successfully");
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
}
