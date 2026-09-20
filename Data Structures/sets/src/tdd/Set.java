package tdd;

public class Set {
    private int size;
    private Object[] set = new Object[10];

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean add(Object number){
        if(size == set.length)grow();
        int index = getIndexOf(number);
        if(index == -99){
            set[size++] = number;
            return true;
        }
        set[index] = number;
        return false;
    }
    public boolean contains(Object number) {
        int index = getIndexOf(number);
        return index != -99;
    }
    public boolean remove(Object number){
        int index = getIndexOf(number);
        if(index != -99){
            move(number);
            size--;
            return true;
        }
        return false;
    }
    public void clear(){
        for(int index = 0; index < size; index++){
            set[index] = null;
        }
        size = 0;
    }
    public int size(){
        return size;
    }
    private int getIndexOf(Object number){
        for (int index = 0; index < size; index++) {
            if (set[index].equals(number)) {
                return index;
            }
        }
        return -99;
    }
    private void grow() {
        Object[] temp = set;
        set = new Object[set.length + (set.length/2)];
        for(int index = 0; index < temp.length; index++){
            set[index] = temp[index];
        }
    }
    private void move(Object number){
        int givenIndex = getIndexOf(number);
        for(int index = givenIndex; index < size - 1; index++){
            set[index] = set[index + 1];
        }
        set[size - 1] = null;
    }
}