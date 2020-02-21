//Node class
//Pierre Lundström
//2020-02-21

public class Node {
    String data; //Define the data string variable
    Node next; //Define the node variable

    public Node(String data, Node next) {
        this.data= data; //Sets class data to the data arg
        this.next = next; //Sets class next to the next arg
    }

    public Node(String data) {
        this.data = data; //Sets class data to the data arg
        this.next = null; //Sets class next to null
    }

    public Node getNext() {
        return next; //Returns next variable

    }
    public String getData() {
        return data; //Returns data variable

    }
}
