import java.util.Scanner;

//main class
public class Main {
    static Scanner sc = new Scanner(System.in);

    //Method to take contact details input from the user
    public static Contact getContact()
    {
        System.out.print("Enter First name: ");
        String firstName = sc.nextLine();

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

        Contact contact = new Contact(firstName,lastName, phoneNumber, email, address, city, state, zipCode);

        return contact;
    }
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to the address book program");

        //object of addressbookCollections class
        AddressBookCollection addressBookCollection = new AddressBookCollection();

        //Added new address book to the collection
        addressBookCollection.addAddressBook("GEVernova");

        //Get and stored the address book of ge vernova
        AddressBook addressBook = addressBookCollection.getAddressBook("GEVernova");
        System.out.println("Selected address book: GE Vernova, continue to your task:");

        //continuous loop that provide option to add edit and delete contact in the addressbook
        while(true)
        {
            //menu in the address book
            System.out.println("Address Book Menu");
            System.out.println("1: Add contact");
            System.out.println("2: Display address book");
            System.out.println("3: Edit contact");
            System.out.println("4: Delete contact");
            System.out.println("5: Exit");
            System.out.println("Choose an option");

            //input for the choice
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1)
            {
                //add contact to the address book
                Contact contact = getContact();
                addressBook.addContact(contact);
            }
            else if(choice == 2)
            {
                //display all contacts in the address book
                addressBook.displayContact();
            }
            else if(choice == 3)
            {
                //edit contact that already exit in the address book
                addressBook.editContact();
            }
            else if(choice == 4)
            {
                //delete existing contact from the address book
                addressBook.deleteContact();
            }
            else if(choice == 5)
            {
                //terminate the loop
                System.out.println("Cycle Terminated");
                break;
            }
            else
            {
                //invalid choice
                System.out.println("Enter Valid Choice");
            }
        }

    }
}