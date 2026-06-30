import java.util.*;
class Contact {

    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {

        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
    }
}

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private HashMap<String, Contact> contactMap = new HashMap<>();

    private HashSet<String> phoneNumbers = new HashSet<>();

    public void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {

            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);

        contactMap.put(name, contact);

        phoneNumbers.add(phone);

        System.out.println("Contact Added.");
    }

    public void searchContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {

            System.out.println(contact);
        } else {

            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact == null) {

            System.out.println("Contact not found.");
            return;
        }

        contacts.remove(contact);

        contactMap.remove(name);

        phoneNumbers.remove(contact.getPhone());

        System.out.println("Contact Deleted.");
    }

    public void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(Contact::getName));

        System.out.println("\nContacts:");

        for (Contact contact : contacts) {

            System.out.println(contact);
        }
    }

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        addressBook.addContact("Amit", "9876543210", "amit@gmail.com");

        addressBook.addContact("Rahul", "9876500000", "rahul@gmail.com");

        addressBook.addContact("Priya", "9876511111", "priya@gmail.com");

        addressBook.addContact("Riya", "9876543210", "riya@gmail.com");

        System.out.println();

        addressBook.searchContact("Rahul");

        System.out.println();

        addressBook.deleteContact("Priya");

        addressBook.displayContacts();
    }
}