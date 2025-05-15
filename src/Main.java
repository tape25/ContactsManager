public class Main {
    public static void main(String[] args){
        ContactsManager  myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "Tape Sopie";
        contact.phoneNumber = "0759665896";
        myContactsManager.addContact(contact);

        Contact contact1 = new Contact();
        contact1.name = "Ornella";
        contact1.phoneNumber = "0103405268";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Natoutou";
        contact2.phoneNumber = "0707988337";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Hermine";
        contact3.phoneNumber = "0595730524";
        myContactsManager.addContact(contact3);

        Contact phone = myContactsManager.searchContact("Hermine");

        System.out.println(phone.phoneNumber);
    }
}