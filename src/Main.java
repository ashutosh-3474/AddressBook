import java.util.Scanner;

//main class
public class Main {
    public static void main(String[] args) {
        //instance of scanner class
        Scanner sc = new Scanner(System.in);
        //welcome message
        System.out.println("Welcome to the address book program");

        //object of addressbook class
        AddressBook addressBook = new AddressBook();

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

            if(choice == 1)
            {
                //add contact to the address book
                addressBook.addContact();
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