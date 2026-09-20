package tdd;

public class ArrayList {
    private int size;
    private Object[] lists = new Object[10];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object element ) {
        if(size == lists.length) {
            grow();
        }
        lists[size++] = element;
    }
    public int size() {
        return size;
    }

    public void remove(int givenIndex) {
        if (givenIndex < 0 || givenIndex >= size) throw new IllegalArgumentException("Wrong input");
        for (int index = givenIndex; index < size - 1; index++)lists[index] = lists[index + 1];
        lists[size - 1] = null;
        size--;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException("Wrong input");
        return lists[index];
    }

    public void removeAll() {
        if (isEmpty()) throw new IllegalArgumentException("Wrong input");
        for (int index = 0; index < size; index++)lists[index] = null;
        size = 0;
    }
    private void grow(){
        Object[] temp = lists;
        lists = new Object[lists.length + (lists.length/2)];
        for(int index = 0; index < temp.length; index++){
            lists[index] = temp[index];
        }
    }
}