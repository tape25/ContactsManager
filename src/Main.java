public class Main {
    public static void main(String[] args){
        ContactsManager  myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "Soeurette";
        contact.phoneNumber = "0202074486";
        myContactsManager.addContact(contact);

        Contact contact1 = new Contact();
        contact1.name = "Melanie";
        contact1.phoneNumber = "0101434567";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Patrick ";
        contact2.phoneNumber = "0707654589";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "grace";
        contact3.phoneNumber = "0239239499";
        myContactsManager.addContact(contact3);

        Contact phone = myContactsManager.searchContact("Soeurette");

        System.out.println(phone.phoneNumber);
    }
}