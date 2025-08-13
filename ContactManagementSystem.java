import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;
    //parameterized constructor 
    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class ContactManagementSystem {
    private static Contact[] contacts = new Contact[100]; // Max 100 contacts
    private static int count = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = readInt();

            switch (choice) {
                case 1: addContact(); break;
                case 2: viewContacts(); break;
                case 3: searchContact(); break;
                case 4: updateContact(); break;
                case 5: deleteContact(); break;
                case 6: System.out.println("Exiting... Goodbye!"); return;
                default: System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        contacts[count] = new Contact(name, phone, email);
        count++;
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (count == 0) {
            System.out.println("No contacts found.");
            return;
        }
        System.out.println("\n--- All Contacts ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + contacts[i].name +
                               " | Phone: " + contacts[i].phone +
                               " | Email: " + contacts[i].email);
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (compareIgnoreCase(contacts[i].name, name)) {
                System.out.println("Name: " + contacts[i].name +
                                   " | Phone: " + contacts[i].phone +
                                   " | Email: " + contacts[i].email);
                found = true;
            }
        }
        if (!found) System.out.println("Contact not found!");
    }

    private static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (compareIgnoreCase(contacts[i].name, name)) {
                System.out.print("Enter new name:");
                contacts[i].name=sc.nextLine();
                System.out.print("Enter new phone: ");
                contacts[i].phone = sc.nextLine();
                System.out.print("Enter new email: ");
                contacts[i].email = sc.nextLine();
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    private static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (compareIgnoreCase(contacts[i].name, name)) {
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1]; // Shift left
                }
                contacts[count - 1] = null;
                count--;
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    private static int readInt() {
        int val = Integer.parseInt(sc.nextLine());
        return val;
    }

    private static boolean compareIgnoreCase(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            // Convert to lowercase manually
            if (c1 >= 'A' && c1 <= 'Z') c1 = (char)(c1 + 32);
            if (c2 >= 'A' && c2 <= 'Z') c2 = (char)(c2 + 32);

            if (c1 != c2) return false;
        }
        return true;
    }
}
