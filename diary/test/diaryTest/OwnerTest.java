package diaryTest;

import diary.Diary;
import diary.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OwnerTest {
    private Owner user;
    private Diary myDiary;
    private String correctPassword = "1973";
    @BeforeEach
    void startWith(){
        myDiary = new Diary(correctPassword);
        user = new Owner(myDiary, correctPassword);
    }
    @Test
    void userInputtedWrongPasswordOnTheDiary(){
        assertThrows(IllegalArgumentException.class, () -> new Owner(myDiary, "1234"));
    }
    @Test
    void testThatUserCanAddToDiary(){
        user.addEntry("I want to go semicolon");
        String[] entries = {"I want to go semicolon"};
        assertArrayEquals(entries,user.viewEntries());
    }
    @Test
    void userAddXY_RemoveX_Y_Remains(){
        user.addEntry("I want to go semicolon");
        user.addEntry("I am going home");
        String[] entries = {"I want to go semicolon","I am going home"};
        assertArrayEquals(entries,user.viewEntries());
        user.deleteEntry(2);
        String[] entriesAfterDelete = {"I want to go semicolon"};
        assertArrayEquals(entriesAfterDelete,user.viewEntries());
    }
    @Test
    void userAddXY_editX_toZ_DisplayZY(){
        user.addEntry("I want to go semicolon");
        user.addEntry("I am going home");
        user.editEntry(2, "I want to eat");
        String[] entries = {"I want to go semicolon", "I want to eat"};
        assertArrayEquals(entries,user.viewEntries());
    }
}
