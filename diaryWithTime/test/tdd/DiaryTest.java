package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary myDiary;
    private String username = "Abdulkadir";
    private String correctPassword = "1234";
    private String incorrectPassword = "4321";

    @BeforeEach
    void startWtih(){
        myDiary = new Diary(username, correctPassword);
    }
    @Test
    void testThatDiary_isLocked_ByDefault(){
        assertTrue(myDiary.isLocked());
    }
    @Test
    void DiaryIsLocked_userEntersCorrectPassword_DiaryIsUnlock(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
    }
    @Test
    void diaryIsLocked_userEntersWrongPassword_ThrowsException_Diary_remainsLocked(){
        assertTrue(myDiary.isLocked());
        assertThrows(IllegalArgumentException.class, () -> myDiary.unlockDiary(incorrectPassword));
        assertTrue(myDiary.isLocked());
    }
    @Test
    void diaryIsLocked_userEntersCorrectPassword_DiaryIsUnlock_userEntersCorrectPassword_DiaryisLocked(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary(correctPassword);
        assertTrue(myDiary.isLocked());
    }
    @Test
    void diaryIsLocked_userEntersCorrectPassword_DiaryIsUnlock_userEntersWrongPassword_ThrowsException_DiaryRemainsUnLocked(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
        assertThrows(IllegalArgumentException.class, () -> myDiary.lockDiary(incorrectPassword));
        assertFalse(myDiary.isLocked());
    }
    @Test
    void diary_isLocked_UserUnlock_UserCreatesAnEntry_checkTheEntryByFindingItWithA_Correct_Id(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("School resumption", "I am going to school  tomorrow");
        Entry expectedEntry = myDiary.findEntryById(1);
        assertEquals("School resumption", expectedEntry.getTitle());
    }
    @Test
    void userCreatesAnEntry_checkTheEntryByFindingItWithA_Wrong_Id_throwsException(){
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("School resumption", "I am going to school  tomorrow");
        assertThrows(IllegalArgumentException.class, () -> myDiary.findEntryById(2));
    }
    @Test
    void userUnlock_UserCreatesTwoEntry_DeleteOne_checkTheDeletedEntry(){
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("School resumption", "I am going to school  tomorrow");
        myDiary.createEntry("Demo", "Mr. Sk's demo");
        myDiary.deleteEntry(2);
        Entry expectedEntry = myDiary.findEntryById(2);
        assertNull(expectedEntry);
    }

}
