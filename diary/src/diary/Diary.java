package diary;

public class Diary {
    private String name;
    private final String password;
    private String[] entries;
    private int entriesCount;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        this.entries = new String[10];
    }
    public boolean isEmpty() {
        return entriesCount == 0;
    }

    public void addEntry(String password, String entry) {
        checkPassword(password);
        entries[entriesCount++] = entry;
    }
    public String[] viewEntries(String password) {
        checkPassword(password);
        String[] actualEntities = new String[entriesCount];
        for(int count = 0; count < entriesCount; count++){
            actualEntities[count] = entries[count];
        }
        return actualEntities;
    }
    public void editEntry(String userPassword, int entryIndex, String newEntry) {
        checkPassword(userPassword);
        checkIndex(entryIndex);
        entries[entryIndex] = newEntry;
    }
    public void deleteEntry(String userPassword, int entryIndex) {
        checkPassword(userPassword);
        checkIndex(entryIndex);
        for (int count = entryIndex; count < entriesCount - 1; count++) {
            entries[count] = entries[count + 1];
        }
        entries[--entriesCount] = null;
    }
    private void checkPassword(String userPassword) {
        if (!this.password.equals(userPassword)) {
            throw new IllegalArgumentException("Incorrect password");
        }
    }
    private void checkIndex(int entryIndex) {
        if (entryIndex < 0 || entryIndex >= entriesCount) {
            throw new IllegalArgumentException("Invalid index");
        }
    }
}