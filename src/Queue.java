//Queue class
//Pierre Lundström
//2020-02-21

public class Queue {

    private int size = 0; //Define the size variable

    LinkedList l = new LinkedList(); //Define a new LinkedList variable

    public Queue() {

    }

    public void enqueue(String text) {
        l.addLast(new Node(text)); //Adds a new node to the linkedlist
        size++; //Increments size by 1
    }

    public String dequeue() {
        if (l.isEmpty()) { //If linkedlist is empty return null
            return null;
        } else {
            l.removeFirst();  //Removes first node from the linkedlist if the linkedlist is not empty
            size--; //Decreases size by 1
            return l.first.getData(); //Returns the first data in the linkedlist
        }
    }

    public boolean isEmpty() {
        if (size() == 0) { //If size = 0 returns true
            return true;
        }
        return false; //If not size = 0 returns false
    }

    public int size() {
        return size; //Returns the size variable
    }


}
