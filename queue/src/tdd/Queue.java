package tdd;

public class Queue {
    private int count;
    private int headIndex = 0;
    private String[] queueContents = new String[5];

    public boolean isEmpty(){
        return count == 0;
    }
    public boolean add(String element){
        if(count == queueContents.length)throw new IllegalArgumentException("Queue is full");
        queueContents[count++] = element;
        return true;
    }
    public String element() {
        if(isEmpty())throw new IllegalArgumentException("Queue is Empty");
        return queueContents[headIndex];
    }
    public boolean offer(String element){
        if(count == queueContents.length)return false;
        queueContents[count++] = element;
        return true;
    }
    public String peek() {
        if(isEmpty()) return null;
        return queueContents[headIndex];
    }
    public String poll() {
        if (headIndex >= queueContents.length)return null;
        return queueContents[headIndex++];
    }
    public String remove() {
        if (headIndex >= queueContents.length)throw new IllegalArgumentException("Empty Queue");
        return queueContents[headIndex++];
    }
}