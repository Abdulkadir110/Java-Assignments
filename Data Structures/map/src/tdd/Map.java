package tdd;

public class Map {
    public int size;
    private String[] keys = new String[10];
    private int[] values = new int[10];

    public boolean isEmpty() {
        return size == 0;
    }
    public int put(String key, int value){
        int index = getIndex(key);
        if(index != -99) {
            values[index] = value;
            return index;
        }
        if(size == keys.length)grow();
        keys[size] = key;
        values[size] = value;
        size++;
        return size - 1;
    }
    public void remove(String key){
        int index = getIndex(key);
        if(index != -99){
            move(key);
            size--;
        }
        if(size == keys.length / 2 && size != 5){
            shink();
        }
    }
    public boolean containsKey(String key){
        int index = getIndex(key);
        if(index != -99) return true;
        return false;
    }
    public int size() {
        return size;
    }
    private void grow() {
        String[] temp = keys;
        keys = new String[keys.length + (keys.length/2)];
        for(int index = 0; index < temp.length; index++){
            keys[index] = temp[index];
        }
        int[] tempValues = values;
        values = new int[values.length + (values.length/2)];
        for(int index = 0; index < tempValues.length; index++){
            values[index] = tempValues[index];
        }
    }
    private int getIndex(String key){
        for (int index = 0; index < size; index++) {
            if (keys[index].equals(key)) return index;
        }
        return -99;
    }
    private void move(String key){
        int givenIndex = getIndex(key);
        for(int index = givenIndex; index < size - 1; index++){
            keys[index] = keys[index + 1];
            values[index] = values[index + 1];
        }
        keys[size - 1] = null;
        values[size - 1] = 0;
    }
    private void shink(){
        String[] temp = keys;
        keys = new String[keys.length - (keys.length/2)];
        for(int index = 0; index < temp.length; index++){
            keys[index] = temp[index];
        }
        int[] tempValues = values;
        values = new int[values.length - (values.length/2)];
        for(int index = 0; index < tempValues.length; index++){
            values[index] = tempValues[index];
        }
    }
}
