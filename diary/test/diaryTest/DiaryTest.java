package diaryTest;

import diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    private final String correctPassword = "8923";
    private final String wrongPassword = "1234";
    @BeforeEach
    void startWith(){
        diary = new Diary(correctPassword);
    }
    @Test
    void testThatDiary_isEmpty(){
        assertTrue(diary.isEmpty());
    }
    @Test
    void testIAddEntry_X_DiaryNotEmpty(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        assertFalse(diary.isEmpty());
    }
    @Test
    void testIAddEntry_XY_DiaryNotEmpty(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr Chi Assignment");
        assertFalse(diary.isEmpty());
    }
    @Test
    void testIAddEntry_XY_ViewTheDiary() {
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        String[] actualDiary = {"I have a demo", "Mr. Chi Assignment"};
        assertArrayEquals(actualDiary , diary.viewEntries(correctPassword));
    }
    @Test
    void testIAddEntry_X_withWrongPassword_ThrowsException(){
        assertTrue(diary.isEmpty());
        assertThrows(IllegalArgumentException.class, () ->diary.addEntry(wrongPassword,"I have a demo"));
    }
    @Test
    void testIAddEntry_XY_ViewWithWrongPassword_ThrowsException(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        assertThrows(IllegalArgumentException.class, () ->diary.viewEntries(wrongPassword));
    }
    @Test
    void testThatIAdd_XY_Edit_X_ViewEntries(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        diary.editEntry(correctPassword, 1,"Mr. Sk Tasks Pending");
        String[] actualDiary = {"I have a demo", "Mr. Sk Tasks Pending"};
        assertArrayEquals(actualDiary, diary.viewEntries(correctPassword));
    }
    @Test
    void testThatIAdd_XY_Edit_with_IndexAboveEntriesSize_andIndexBelow0_throws_Exception(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        assertThrows(IllegalArgumentException.class, () ->diary.editEntry(correctPassword, 2,"Mr. Sk Tasks Pending"));
        assertThrows(IllegalArgumentException.class, () ->diary.editEntry(correctPassword, -1,"Mr. Sk Tasks Pending"));
    }
    @Test
    void testIAddXY_DeletedXY_Entries_IsEmpty(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        assertFalse(diary.isEmpty());
        diary.deleteEntry(correctPassword, 0);
        diary.deleteEntry(correctPassword, 0);
        assertTrue(diary.isEmpty());
    }
    @Test
    void testIAddXY_DeleteX_ViewEntries_X_NotThere(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        diary.deleteEntry(correctPassword, 0);
        String[] actualDiary = {"Mr. Chi Assignment"};
        assertArrayEquals(actualDiary, diary.viewEntries(correctPassword));
    }
    @Test
    void testIAddXY_DeletedX_Entrie_IsNotEmpty(){
        assertTrue(diary.isEmpty());
        diary.addEntry(correctPassword,"I have a demo");
        diary.addEntry(correctPassword,"Mr. Chi Assignment");
        assertFalse(diary.isEmpty());
        diary.deleteEntry(correctPassword, 1);
        assertFalse(diary.isEmpty());

    }
}
