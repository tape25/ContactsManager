public class ContactsManager {
    //Attributs
    public Contact[] myFriends;
    public int friendsCount;

    /*Constructeur par défaut qui initialise friendsCount à 0
    * et crée un tableau myFriends de 500 éléments*/
    public  ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Méthode addContacts pour ajouter un contact au tableau
    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}




