public class MergeTwoSortedLists {
    public static int[] sortedArrayOf(int[] list){
        int temp = 0;
        for(int index = 0; index < list.length; index++){
            for(int secondIndex = index + 1; secondIndex < list.length; secondIndex++){
                if(list[secondIndex] < list[index]){
                    temp = list[secondIndex];
                    list[secondIndex] = list[index];
                    list[index] = temp;   
                }
            }
        }
        return list;
    }
    public static int[] mergeSortedArraysOf(int[] list1, int[] list2){
        int mergedArraysLength = list1.length + list2.length;
        int[] mergedArrays = new int[mergedArraysLength];
        int[] sortedList1 = sortedArrayOf(list1);
        int[] sortedList2 = sortedArrayOf(list2);
        
        for(int index = 0; index < list1.length; index++){
            mergedArrays[index] = sortedList1[index];
        }
        int newIndex = 0;
        for(int index = list1.length; index < mergedArrays.length; index++){
            mergedArrays[index] = sortedList2[newIndex];
            newIndex++;
        }
        return mergedArrays;
    }
    public static int[] merge(int[] list1, int[] list2) {
        return sortedArrayOf(mergeSortedArraysOf(list1, list2));
    }
}
