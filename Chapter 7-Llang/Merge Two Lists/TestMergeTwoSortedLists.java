import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestMergeTwoSortedLists{
    @Test
    public void testThatTheGivenArraysAreSorted(){
        //Given
        int[] list1 = {5,1,5,16,61,111};
        int[] list2 = {4,2,4,5,6};
        
        //when
        int[] expectedSortedList1 = MergeTwoSortedLists.sortedArrayOf(list1);
        int[] expectedSortedList2 = MergeTwoSortedLists.sortedArrayOf(list2);
        
        int[] actualSortedList1 = {1,5,5,16,61,111};
        int[] actualSortedList2 = {2,4,4,5,6};
        //Check
        assertArrayEquals(expectedSortedList1, actualSortedList1);
        assertArrayEquals(expectedSortedList2, actualSortedList2);
    }
    @Test
    public void testThatBothSortedArraysAreMerged(){
        //Given
        int[] list1 = {5,1,5,16,61,111};
        int[] list2 = {4,2,4,5,6};
        
        //when
        int[] expectedMergedLists = MergeTwoSortedLists.mergeSortedArraysOf(list1, list2);
        int[] actualMergedLists = {1,5,5,16,61,111,2,4,4,5,6};
        
        //Check
        assertArrayEquals(expectedMergedLists, actualMergedLists);
    }
    @Test
    public void testThatMergedArraysAreSorted(){
        //Given
        int[] list1 = {5,1,5,16,61,111};
        int[] list2 = {4,2,4,5,6};
        
        //when
        int[] expectedMergedLists = MergeTwoSortedLists.merge(list1, list2);
        int[] actualMergedLists = {1,2,4,4,5,5,5,6,16,61,111};
        
        //Check
        assertArrayEquals(expectedMergedLists, actualMergedLists);
    }
    
}
