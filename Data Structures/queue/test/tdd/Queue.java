
package tdd;

public class Queue {
    private int numberOfElements;
    private int headIndex;
    private int rearIndex = -1;
    private final String[] queueContents = new String[5];

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean add(String element) {
        if (numberOfElements == queueContents.length) {
            throw new IllegalArgumentException("Queue is full");
        }

        if (rearIndex == queueContents.length - 1) {
            shiftElementsToFront();
        }

        queueContents[++rearIndex] = element;
        numberOfElements++;
        return true;
    }

    public boolean offer(String element) {
        if (numberOfElements == queueContents.length) return false;
        if (rearIndex == queueContents.length - 1) {
            shiftElementsToFront();
        }

        queueContents[++rearIndex] = element;
        numberOfElements++;
        return true;
    }

    public String element() {
        if (isEmpty())throw new IllegalArgumentException("Queue is empty");
        return queueContents[headIndex];
    }

    public String peek() {
        if (isEmpty()) return null;
        return queueContents[headIndex];
    }

    public String poll() {
        if (isEmpty()) return null;
        String element = queueContents[headIndex];
        queueContents[headIndex] = null;
        headIndex++;
        numberOfElements--;

        if (numberOfElements == 0) {
            headIndex = 0;
            rearIndex = -1;
        }
        return element;
    }
    public String remove() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        String element = queueContents[headIndex];
        queueContents[headIndex] = null;
        headIndex++;
        numberOfElements--;

        if (numberOfElements == 0) {
            headIndex = 0;
            rearIndex = -1;
        }
        return element;
    }
    public int size() {
        return numberOfElements;
    }
    private void shiftElementsToFront() {
        for (int index = 0; index < numberOfElements; index++) {
            queueContents[index] = queueContents[headIndex + index];
        }
        headIndex = 0;
        rearIndex = numberOfElements - 1;
    }
}
