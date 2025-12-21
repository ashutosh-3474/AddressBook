import java.util.ArrayList;
import java.util.Scanner;

//address book class
public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contacts= new ArrayList<>();

    //function to display all contacts in the address book
    public void displayContact()
    {
        if (contacts.isEmpty())
        {
            System.out.println("No contact available");
        }
        else
        {
            for(Contact contact : contacts)
            {
                System.out.println(contact);
            }
        }
    }

    //function to add contact to the contacts list in the address book
    public void addContact(Contact contact)
    {
        contacts.add(contact);
    }



    //function to edit contact that already exit in the address book
    public void editContact()
    {
        System.out.println("Enter First name of the contact to edit");
        String firstName = sc.nextLine();

        for (Contact contact : contacts)
        {
            if (contact.getFirstName().equalsIgnoreCase(firstName))
            {
                System.out.println("Contact matched, enter new details:");

                System.out.print("Enter Last name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter phone number: ");
                String phoneNumber = sc.nextLine();

                System.out.print("Enter email address: ");
                String email = sc.nextLine();

                System.out.print("Enter address details:");
                String address = sc.nextLine();

                System.out.print("Enter City:");
                String city = sc.nextLine();

                System.out.print("Enter State:");
                String state = sc.nextLine();

                System.out.print("Enter Zip Code:");
                String zipCode = sc.nextLine();

                contact.setLastName(lastName);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setZipCode(zipCode);

                System.out.println("Contact edited successfully");
            }
        }
    }

    //function to delete existing contact
    public void deleteContact()
    {
        //input detail of the contact to delete
        System.out.println("Enter First name of the contact to delete");
        String firstName = sc.nextLine();

        Contact toRemove = null;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Match Found");
                toRemove = contact;
                break;
            }
        }

        if (toRemove != null) {
            System.out.println("Contact Deleted Successfully");
            contacts.remove(toRemove);
        }
        else
        {
            System.out.println("Contact does not exist");
        }
    }
}
