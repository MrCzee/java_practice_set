package youtube_series;

import java.util.Scanner;
import java.util.Stack;

public class BinerySearchTree {
	
	private Node root;

	public BinerySearchTree() {
		  root  = null;
	}
	
	void insert(int id , double dd)
	{
		
		Node newNode = new Node();
		newNode.idata = id;
		newNode.ddata = dd;
		if(root == null)
		{
			root = newNode;
		}
		else {
			Node curNode = root;
			Node parent;
			
			while(true)
			{
				parent = curNode;
				if(id<curNode.ddata) {// goto left subtree
					
					curNode = curNode.left;
					if(curNode == null)
					{
						parent.left = newNode;
						return;
					}
				} // end if goto left
				else {
					  // goto right
					   curNode = curNode.right;
					   if(curNode == null)
					   {
						   // insert on the right
						   parent.right = newNode;
						   return;
					   }
					   
				} // end goto right
			} // end while
		} //end insert method
		
	}
	
	//....................................................//
	
	
	
	public boolean delele(int key)
	{
		
		Node current = root;
		Node parent = root;
		
		boolean isLeftchild = true;
		
		while(current.idata != key)  // search for key
		{
			parent = current;
			
			if(key < current.idata) // goto left
			{
				isLeftchild = true;
				current = current.left;
			}
			
			else {
				// goto right

				isLeftchild = false;
				current = current.right;
				
			}
			if(current == null) // end of the line did,t find it
			{
				return false;
	
			}
		}  // end while looop
		
		// find node for delete
		// if no children, simply delete it
		if(current.left == null && current.right == null)
		{
			if(current == root)
			{
				root  = null;
			}
			else if(isLeftchild) {
				parent.left  = null;
			}
			else {
				parent.right = null;
			}
		}
		
		// if no right child replace with left child
		else if(current.right == null)
		{
			if(current == root)
			{
				root = current.left;
			}
			else if(isLeftchild)
			{
				parent.left = current.left;
			}
			else {
			parent.right = current.right;
			
			}
		}
		else {
			// two childeren, so replace with inorder successor
			Node successor = getSuccessor(current);
			
			// connect parent of current successor
			
			if(current == root)
			{
				root = successor;
				
			}
			else if(isLeftchild){
			    
				parent.left = current.left;
			}
			else {
				parent.right = current.right;
			}
			
			successor.left = current.left;
		} // end else two childs 
		
		return true;
		
		
		
	}

	
	
	
	
	
	
	private Node getSuccessor(Node delnode) {  /// 10
		
		// return the node with the height value after the del_node
		// goes to right child, then right child's left descendents
		
		Node succParent = delnode;  // value of root means delnode will be 10
		
		Node successor = delnode;   // 10
		
		Node currentNode = delnode.right;  // goto the right untill no more left children    18
		
		
		
		
		      /*
		       * 
		       *              10
		       *              
		       *         5          15
		       *         
		       *       null       8    18
		       *                            
		       *                          20
		       *                         
		       *  
		       */
		while(currentNode != null)
		{
		   
			succParent = successor;    //>>10
			successor = currentNode;   //>>18
			currentNode = currentNode.left; //>>8  // goto left child 
		}
		   //>>18            
		if(successor != delnode.right)
		{
			succParent.left = successor.right;
		}
		return successor;
	}/// end getSuccessor
	
	
	
	void terverse(int terverseType)
	{
		
		switch(terverseType)
		{
		case 1:
			System.out.println("Preorder Traversal");
			preOrder(root);
		    break;
		case 2:	    
		    System.out.println("Inorder Traversal");
		    Inorder(root);
		    break;
		case 3:	    
		    System.out.println("PostOrder Traversal");
		    PostOrder(root);
		    break;
		    
		    
		}
		
		
	}

	private void PostOrder(Node root2) {

		if(root2 != null)
		{
			System.out.println(root2.ddata+" ");
			PostOrder(root2.left);
			PostOrder(root2.right);
		}
	}

	private void Inorder(Node root2) {
		if(root2 != null)
		{
			Inorder(root2.left);
			System.out.println(root2.ddata+" ");
			Inorder(root2.right);
		}	
	}

	private void preOrder(Node root2) {

		if(root2 != null)
		{
			preOrder(root2.left);
			preOrder(root2.right);
			System.out.println(root2.ddata+" ");

		}
		
	}
	

	
	void displayTree()
	{
		Stack globelStack = new Stack();
		globelStack.push(root);
		int nBlocks = 32;
		boolean isRowEmpty = false;
		System.out.println("-------------------------------------------");
		while (isRowEmpty == false) 
		{
		
			Stack localStack  = new Stack<>();
			isRowEmpty = true;
		
			for(int i=0;i<nBlocks ; i++)
			{
		
	           System.out.print(" ");
	           
	           while(globelStack.isEmpty() == false)
	           {
	        	   Node temp = (Node) globelStack.pop();
	        	   
	        	   if(temp != null)
	        	   {
	        		   System.out.println(temp.ddata);
	        		   localStack.push(temp.left);
	        		   localStack.push(temp.right);
	        		   
	        		   if(temp.left != null || temp.right !==null)
	        		   {
	        			   
	        			   isRowEmpty = false;
	        			   
	        		   }
	        		   else {
	        			   System.out.println("--");
	        			   localStack.push(null);
	        			   localStack.push(null);
	        		   }
	        		   for(int i = 0; i<nBlocks*2-2;i++) {
	        			   System.out.println(" ");
	        		   }
	        	   }
	           }// end while loop
	           System.out.println();
	           nBlocks /=2;
	           while(localStack.isEmpty() == false) {
	        	   globelStack.push(localStack.pop() );
	        	   
	           } // end while
	           
	           System.out.println("-------------------------------------");
	           
	     	}// end display Tree
		
			
	} // end class tree
	
	}
	}
	
    	
	
	
	
	
    
    

