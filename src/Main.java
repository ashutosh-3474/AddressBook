import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the address book program");

        AddressBook addressBook = new AddressBook();

        while(true)
        {
            System.out.println("Address Book Menu");
            System.out.println("1: Add contact");
            System.out.println("2: Display address book");
            System.out.println("3: Edit contact");
            System.out.println("4: Delete contact");
            System.out.println("5: Exit");
            System.out.println("Choose an option");

            int choice = sc.nextInt();

            if(choice == 1)
            {
                addressBook.addContact();
            }
            else if(choice == 2)
            {
                addressBook.displayContact();
            }
            else if(choice == 3)
            {
                //edit
            }
            else if(choice == 4)
            {
                //delete
            }
            else if(choice == 5)
            {
                System.out.println("Cycle Terminated");
                break;
            }
            else
            {
                System.out.println("Enter Valid Choice");
            }
        }

    }
}