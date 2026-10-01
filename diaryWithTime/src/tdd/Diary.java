package tdd;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void unlockDiary(String userPassword){
        validatePassword(userPassword);
        isLocked = false;
    }
    public void lockDiary(String userPassword){
        validatePassword(userPassword);
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void createEntry(String title, String body) {
        Entry entry = new Entry(entries.size() + 1, title, body);
        entries.add(entry);
    }
    public void deleteEntry(int givenId){
        validate(givenId);
        for(Entry entry : entries){
            if(entry.getId() == givenId) {
                entries.remove(entry);
                break;
            }
        }
    }
    public Entry findEntryById(int givenId) {
        boolean isValidId = isValid(givenId);
        if(!isValidId) return null;
        for(Entry entry : entries){
            if(entry.getId() == givenId) {
                return entry;
            }
        }
        return null;
    }
    private void validatePassword(String userPassword){
        if(!this.password.equals(userPassword)) throw new IllegalArgumentException("Incorrect Password");
    }
    private boolean isValid(int givenId) {
        return givenId >= 1 && givenId <= entries.size();
    }
    private void validate(int givenId){
        if(!isValid(givenId)) throw new IllegalArgumentException("Invalid id");
    }
}
