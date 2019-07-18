import java.util.*;
public class Node {
	protected int data;
	protected Node link;
	public Node() {
		data = 0;
		link = null;
	}
	public Node(Node link, int data){
		this.data = data;
		this.link = link;
	}
	public void setLink(Node n) {
		link = n;
	}
	public void setData(int d){
		data = d;
	}
	public Node getLink(){
		return link;
	}
	public int getData(){
		return data;
	}
}
class linkedList {
	protected Node start;
	protected Node end;
	public int size;
	public LinkedLIst(){
		start = null;
		end = null;
		size = 0;
	}
	public boolean isEmpty() {
		return (start == null);
	}
	public int getSize(){
		return size;
	}
	public void insertAtStart(int val){
		Node nptr = new Node( null , val);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		}
		else {
			nptr.setLink(start);
			start = nptr;
		}

	}

	public void insertAtEnd(int val){
		Node nptr = new Node( null , val);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		}
		else {
			end.setLink(nptr);
			end = nptr;
		}
	}

	public void insertAtPos(int val, int pos) {
		Node nptr = new Node(val , null);
		Node ptr = start;
		pos = pos-1;
		for (int i=1; i<size;i++ ) {
			if (i==pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLinkCursor(temp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	public void deleteAtPos(int pos){
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while(s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos-1;
		for (int i=1; i<size-1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	public void display() {
		System.out.println("\n Singly LinkedList = ");
		if (size = 0) {
			System.out.println("emplty\n");
			return ;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
		}
		Node ptr = start;
		System.out.println(start.getData()+ " -> ");
		ptr = start.getLink();
		while(ptr.getLink() != null){
			System.out.println(ptr.getData()+" -> ");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData()+ "\n");
	}
}

public class SinglyLinkedList{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedList list = new linkedList()
		System.out.println("Singly LinkedList Test \n");
		char ch;
		do {
			System.out.println("\n Singly linkedList operations \n");
			System.out.println("1. insert at beginning");
			System.out.println("2. insert at end");
			System.out.println("3. insert at Position");
			System.out.println("4. delete at Position");
			System.out.println("5. check Empty");
			System.out.println("6. get Size");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
						System.out.println("Enter Integer value to insert");
						list.insertAtStart(sc.nextInt());
						break;

				case 2:
						System.out.println("Enter the Integer to insert");
						list.insertAtEnd(sc.nextInt());
						break;

				case 3:
						System.out.println("insert the 'Integer' to "\Insert"");
						int num = sc.nextInt();
						System.out.println("enter the position");
						int pos = sc.nextInt();
						if (pos <= 1 || pos > list.getSize()) {
							System.out.println("\n invalid position \n");
						}
						else {
							list.insertAtPos(num, pos);
						}
						break;
				case 4: 
						System.out.println("enter the position");
						int p = sc.nextInt();
						if(p< 1 || p> list.getSize()){
							System.out.println("invalid position");
						}
						else {
							list.deleteAtPos(p);
						}
						break;

				case 5: 
						System.out.println("Empty status = "+ list.isEmpty());
						break;

				case 6:
						System.out.println("enter the position");
						break;
				default :
						System.out.println("invalid entry");




		}
	}
}