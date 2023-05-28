
public class BineryTree {
    
	Node root;
	
	public BineryTree()
	{
		root = null;
	}
	
	void insertDate(int data)
	{
		Node newNode = new Node(data);
		newNode.data = data;
		
		if(root == null)
		{
			root = newNode;
		}
		
		Node current = root;
		Node parent;
		
		while(current != null)
		{
			parent = current;
			if(data<current.data)
			{
				current = current.left;
				if(current == null)
				{
					parent.left = newNode;
				}
			}
			else {
				current = current.right;
				if(current == null)
				{
					parent.right = newNode;
				}
			}
		}
	}// end insert
	
	//<<...................DELETE.....................>>//
	
	
	public boolean delete(int key)
	{
		Node current = root;
		Node parent = root;
		boolean isleftChild = true;
		
		while(current.data != key)
		{
			
			parent = current;
			
			if(key<current.data)
			{
				isleftChild = true;
				current = current.left;
			}
			else {
				isleftChild = false;
				current = current.right;
			}
			
		}
		
		
		//when there is no child.. deleting leaf node
		if(current.left == null && current.right == null)
		{
			if(current == root)
				root = null;
			else if(isleftChild)
				parent.left = null;
			else
				parent.right = null;
		}
		// deleting a node having only one child
		else if(current.right == null)
		{
			if(current == root)
				root = current.left;
			else if(isleftChild)
				parent.left = current.left;
			else
				parent.right = current.right;
		}
		
		// deleting a root node means a node having two nodes
		else {
			
		}
	}
}
