public class llDemo
{

    public Node head;

    public static void main(String [] args) {

    }

    //Methods adds a link to the head
    //Appends to the beginning of the list

    public void addFirst(int data) {
        Node head = new Node(data, head);
        //Because head is the pointer to the first node   

        // Traversing the list
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
    }

    //Adding at the end of the list

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            //When the list is empty, i.e, head points to null
        } else {//When list is populated
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                temp.next = new Node(data, null);
            }
        }
    }

    //To insert a new node after a given "key"
    //_data is the new node data 

    public void insAft(int _data, int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = new Node(_data, temp.next);
        }
    }
}

/*Node class to create the node (object)
 * takes integer parameters
 */

class Node{

    public int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + " ";
    }
}