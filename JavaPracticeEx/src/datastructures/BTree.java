package datastructures;

public class BTree {

	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);

		if (root == null)

			root = newNode;
		else {

			Node currentNode = root;
			Node parent;

			while (true) {

				parent = currentNode;

				if (key < currentNode.key) {
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else

				{
					currentNode = currentNode.rightChild;

					if (currentNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}

			}

		}

	}

	public void preOrder(Node node) {
		if (node != null) {
			System.out.println(node.key + " " + node.name);
			preOrder(node.leftChild);
			preOrder(node.rightChild);

		}

	}

	public void deleteNode(int key) {

		Node currentNode = root;
//		Node parent;
         
		while (true)

		{
			if(key<currentNode.key)
			{
			currentNode = currentNode.leftChild;
			if (currentNode.key == key) {
				
				if(currentNode.leftChild!=null && currentNode.rightChild!=null)
				{
				currentNode=minimum(currentNode.leftChild, currentNode.rightChild);
				currentNode.leftChild=null;
				return;
				}
				else if(currentNode.leftChild==null && currentNode.rightChild!=null)
						currentNode=currentNode.rightChild;
						
					else if(currentNode.leftChild==null && currentNode.rightChild==null)
					{
						currentNode=null;
						return;
					}
					else
						currentNode=currentNode.leftChild;
				
				
			}
				
				
			}
			
			else
				currentNode = currentNode.rightChild;
			if (currentNode.key == key) {
				
				if(currentNode.rightChild!=null && currentNode.leftChild!=null)
				{
				currentNode=minimum(currentNode.leftChild, currentNode.rightChild);
				currentNode.rightChild=null;
				return;
				}
				else if(currentNode.rightChild==null && currentNode.leftChild!=null)
						currentNode=currentNode.leftChild;
						
					else if(currentNode.leftChild==null && currentNode.rightChild==null)
					{
						currentNode=null;
						return;
					}
					else
						currentNode=currentNode.rightChild;
				
				
			}
				
				
			}
			}
			
			
			
		
			

	

	private Node minimum(Node leftChild, Node rightChild) {

		if (leftChild.key < rightChild.key)
			return leftChild;
		else
			// TODO Auto-generated method stub
			return rightChild;
	}

	public static void main(String[] args) {

		BTree bt = new BTree();
		bt.addNode(50, "Bodd");
		bt.addNode(25, "Vice Pres");
		bt.addNode(15, "Office Manager");
		bt.addNode(30, "Secretary");
		bt.addNode(75, "Sales Manager");
		bt.addNode(85, "Salesman");
//		bt.preOrder(bt.root);

		bt.deleteNode(85);

		System.out.println();

		bt.preOrder(bt.root);

	}

}
