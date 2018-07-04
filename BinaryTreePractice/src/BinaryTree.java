
public class BinaryTree {

	private Node root;
	public BinaryTree()
	{
		root = null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int newData)//insert the new node into the BST
	{
		Node newNode = new Node(newData);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			insert(root,newNode);	
		}
	}
	
	private void insert(Node newRoot, Node newNode)
	{
		
	   if(newNode.data < newRoot.data && newRoot.left == null)
		{
			newRoot.left = newNode;
		}
	   
	    else if (newNode.data > newRoot.data && newRoot.right == null)
		{
			newRoot.right = newNode;
		}
		else if(newNode.data < newRoot.data)
		{
			insert(newRoot.left, newNode);
		}
		else
		{
			insert(newRoot.right, newNode);
		}
	}
	
	public boolean find(int data)//find the node
	{
		if(find(root,data) == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	private Node find(Node newRoot, int data)
	{
		if(newRoot == null || data == newRoot.data)
		{
			return newRoot;
		}
	    else if(data > newRoot.data)
		{
			return find(newRoot.right,data);
		}
		else 
		{
			return find(newRoot.left,data);
		}
		
	}

	public void inOrder()
	{
		if(root == null)
		{
			System.out.println("null");
		}
		else
		{
			inOrder(root);
		}
	}
	private void inOrder(Node newRoot)
	{
		if(newRoot!= null)
		{
			inOrder(newRoot.left);
			System.out.print(newRoot.data + " ");
			inOrder(newRoot.right);
		}
	}

	public void preOrder()
	{
		if(root == null)
		{
			System.out.println("null");
		}
		else
		{
			preOrder(root);
		}
	}
	private void preOrder(Node newRoot)

	{
		if(newRoot!=null)
		{
			System.out.print(newRoot.data + " ");
			preOrder(newRoot.left);
			preOrder(newRoot.right);
		}
	}

	public void postOrder()
	{
		if(root == null)
		{
			System.out.println("null");
		}
		else
		{
			postOrder(root);
		}
	}
	private void postOrder(Node newRoot)
	{
		if(newRoot!=null)
		{
			postOrder(newRoot.left);
			postOrder(newRoot.right);
			System.out.print(newRoot.data + " ");
		}
	}
}
