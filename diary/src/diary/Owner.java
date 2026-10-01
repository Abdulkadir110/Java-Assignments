package diary;

public class Owner {
    private Diary diary;
    private String diaryPassword;

    public Owner(Diary diary, String password) {
        this.diary = diary;
        diary.validatePassword(password);
        this.diaryPassword = password;
    }
    public void addEntry(String entry){
        diary.addEntry(diaryPassword, entry);
    }
    public String[] viewEntries(){
        return diary.viewEntries(diaryPassword);
    }
    public void deleteEntry(int entryNumber){
        diary.deleteEntry(diaryPassword, (entryNumber -1));
    }
    public void editEntry(int entryNumber, String newEntry){
        diary.editEntry(diaryPassword, (entryNumber - 1), newEntry);
    }
}