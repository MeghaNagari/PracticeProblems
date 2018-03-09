package datastructures;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BinaryTreeEx {

	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;

			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}

				}

				else
					focusNode = focusNode.rightChild;

				if (focusNode == null) {
					parent.rightChild = newNode;
					return;
				}

			}

		}

	}

	public void inOrderTraversal(Node focusNode) {
		if (focusNode != null) {
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChild);
		}
	}

	public void preOrderTraversal(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);
			preOrderTraversal(focusNode.leftChild);

			preOrderTraversal(focusNode.rightChild);
		}
	}

	public void postOrderTraversal(Node focusNode) {

		if (focusNode != null) {

			preOrderTraversal(focusNode.leftChild);

			preOrderTraversal(focusNode.rightChild);

			System.out.println(focusNode);
		}
	}

	public boolean remove(int key) {
		Node focusNode = root;
		Node parent = root;

		boolean isItALeftChild = true;
		while (focusNode.key != key) {
parent=focusNode;
if(key<focusNode.key)
{
	isItALeftChild=true;
	focusNode=focusNode.leftChild;
}
else
{
isItALeftChild=false;
focusNode=focusNode.rightChild;
}
			
if(focusNode==null)
	return false;

		}
		
		if(focusNode.leftChild==null && focusNode.rightChild==null)
				{
			if(focusNode==root)
				root=null;
				}
		else if(isItALeftChild)
		{
			parent.leftChild=null;
			
		}
		else
			parent.rightChild=null;
	
		else if(focusNode.rightChild==null)
		{
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeEx tree = new BinaryTreeEx();

		tree.addNode(50, "Bodd");
		tree.addNode(25, "Vice Pres");
		tree.addNode(15, "Office Manager");
		tree.addNode(30, "Secretary");
		tree.addNode(75, "Sales Manager");
		tree.addNode(85, "Salesman 1");

		tree.preOrderTraversal(tree.root);

	}

}
