//LinkedList class
//Pierre Lundström
//2020-02-21

public class LinkedList {
    Node first; //Define the node first variable
    Node last; //Define the node last variable
    private int size = 0; //Define the int size variable

    /**
     * Constructor to create an empty list.
     */
    public LinkedList() {
        first = null;  //Sets first to null upon class initiation
        last = null; //Sets last to null upon class initiation
    }


    /**
     * Adds a new Node to the list. The Node is always added last. There's a special case when the list is empty
     * (first=null). Make sure to solve that properly...
     * @param newNode
     */
    public void addLast(Node newNode) {
        if (first == null) { //If first equals null
            first = newNode; //first sets to newNode
            last = newNode; //last sets to newNode
            size++; //Increments size by 1

        } else {
            size++; //Increments size by 1
            last.next = newNode; //Sets last.next to NewNode so that last node will be set to this new Node
            last = newNode; //Sets last node to NewNode
            last.next = null; //Sets last.next to null after having set last to new Node

        }
    }

    /**
     * Removes and returns the first element of the list. Check if the list is empty and return null in that case
     * (bad practice, should throw an Exception)
     * @return
     */
    public Node removeFirst() {
        if (size == 0) { //If size is 0 return null
            return null;
        }
        else {
            try {
                size--; //Decrease size by 1
                Node node = first; //Sets the node variable to the first node in the list then returns the node.
               return node; //Returns the first node of the linkedlist
            } catch (Exception e) { //If any exception
                e.printStackTrace(); //Print stacktrace error to system.out
            }
        }
return null;
    }

    /**
     * Return the size of the queue. Either implement as a loop calculating at each call (go through the nodes,
     * counting as you go OR use an internal variable (private int size) to continuously keep track of the queue-size).
     * Could be used by isEmpty...
     * @return
     */
    public int size() {
        return size; //Returns size variable
    }

    /**
     * returns true if the queue is empty.
     * @return
     */
    public boolean isEmpty() {
        return size() == 0; //Checks if size() is 0
    }

}