package tdd;

public class LinkedList{
    private Node head;
    int size;
    public LinkedList(){
        this.head = null;
        this.size = 0;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            this.head = newNode;
        }
        else {
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }
    public boolean contains(int data){
        Node current = this.head;
        while(current != null){
            if(current.data == data) return true;
            current = current.next;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index");
        }
        Node current = this.head;
        int count = 0;
        while (count != index) {
            current = current.next;
            count++;
        }
        return current.data;
    }
    public void addFirst(int data) {
        if (this.head == null) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }
    }
    public int element() {
        return this.head.data;
    }
    public boolean remove(int index){
        if(index < 0 || index >= size ) return false;
        if(index == 0)return false;
        int count = 0;
        Node current = this.head;
        while(current.next != null){
            count++;
            if(count == index - 1){
                current.next = current.next.next;
                size--;
                return true;
            }
        }
        return false;
    }


}

