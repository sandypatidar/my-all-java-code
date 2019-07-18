class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	BinaryTree(){
		root = null;
	}

	void printPostOrder(Node node){
		if (node ==  null) 
			return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key+" ");

	}

	void printInOrder(Node node){
		if (node == null) {
			return;
		}

		printInOrder(node.left);
		System.out.println(node.key+" ");
		printInOrder(node.right);
	}

	void printPreOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.key+" ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
}

public class Traversal {
	public static void main(String[] args) {
		
	}
}