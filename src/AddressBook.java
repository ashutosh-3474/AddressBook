import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contacts= new ArrayList<>();


    public void addContact(Contact contact)
    {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

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

    public void addContact()
    {
        System.out.print("Enter First name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.println("Enter address details:");
        String address = sc.nextLine();

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip Code:");
        String zipCode = sc.nextLine();

        Contact contact = new Contact(firstName,lastName, phoneNumber, email, address, city, state, zipCode);
        contacts.add(contact);
    }
}
