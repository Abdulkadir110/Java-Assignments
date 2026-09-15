import java.util.ArrayList;
 
public class ContactListManager {
    private ArrayList<String[]> phoneBook = new ArrayList<>();
 
    public void addNewContactTo(String name, String phoneNumber){
        if(phoneNumber.length() > 10){
            String[] eachContact = new String[2];
        
            eachContact[0] = name;
            eachContact[1] = phoneNumber;
 
            this.phoneBook.add(eachContact);
        }
        
    }
 
    public ArrayList<String[]> displayContactIn(){
        return phoneBook;
    }
 
}
