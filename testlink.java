package demo;

import java.util.Random;

import demo.linkedl.Node;


class linkedl{
	Node  head;
	private int size;
	
    private int numofSwaps = 0;
    private int numofcompr = 0;

      linkedl(){
    	
    	this.size = 0;
    	
    	}


	
	
	
 class Node{
	private int data;
    Node next;

	
	Node(int data)
	{
		this.data = data;
		this.next = null;
		size++;
	}
	
}
 

 void InsertData(int data){
		Node newNode = new Node(data);
		if(head == null) {
			
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
 

//.................<Sorting linked list>..............//
 
 
 
 
 
 
 
 Node partitionLast(Node start, Node end)
 {
     if (start == end || start == null || end == null)
         return start;

     Node pivot_prev = start;
     Node curr = start;
     int pivot = end.data;

     while (start != end) {
         if (start.data < pivot) {

             pivot_prev = curr;
             int temp = curr.data;
             curr.data = start.data;
             start.data = temp;
             curr = curr.next;
         }
         start = start.next;
     }

     // Swap the position of curr i.e.
     // next suitable index and pivot
     int temp = curr.data;
     curr.data = pivot;
     end.data = temp;

 
     return pivot_prev;
 }

 void sort(Node start, Node end)
 {
     if (start == null || start == end || start == end.next)
         return;

     Node pivot_prev = partitionLast(start, end);
     { sort(start, pivot_prev);}

    
     if (pivot_prev != null && pivot_prev == start)
     { sort(pivot_prev.next, end);}

     else if (pivot_prev != null && pivot_prev.next != null)
     { sort(pivot_prev.next.next, end);}
 }
 ///
 

	Node getMiddle22(Node head)
	{
		
		Node slow =head;
		Node fast = head;
		while(slow!= null && fast !=null)
			slow = slow.next;
	        fast = fast.next;
		
		return slow;
		
	}
	Node sortedMerge(Node a, Node b)
    {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
  
        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
  
    Node mergeSort(Node head)
    {
        // Base case : if head is null
        if (head == null || head.next == null) {
            return head;
        }
  
        // get the middle of the 
        Node middle = getMiddle(head);
        Node nextofmiddle = middle.next;
  
        middle.next = null;
  
        Node left = mergeSort(head);
  
        Node right = mergeSort(nextofmiddle);
  
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
  
    public static Node getMiddle(Node head)
    {
        if (head == null)
            return head;
  
        Node slow = head, fast = head;
  
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
  
    void push(int new_data)
    {
        /* allocate node */
    	Node new_node = new Node(new_data);
  
        /* link the old list off the new node */
        new_node.next = head;
  
        /* move the head to point to the new node */
        head = new_node;
    }
  

  
 // 

 
 void shellsort(int size)
 
 { 
   int i,j,temp,inc=size/2;
   Node curNode = head;
   Node nNode = head;
   {
       for(i=0;i<size;i++)
         { 
           for(j=i+inc;j<size;j+=inc)
            { 
        	   nNode=head;
             // moveptr(b,j);
              if(curNode.data < nNode.data)
                { temp=nNode.data;
                nNode.data=curNode.data;
                  curNode.data=temp;
                }
            }
           curNode = curNode.next;
           }
       inc=inc/2;
    }
}
 
 
 ///

void printList()
{
	if(head == null)
	{
		System.out.println("Node is Empty");
		return;
	}
	
	Node curNode = head;
	
	while(curNode != null)
	{
		System.out.println(" "+curNode.data);
		curNode = curNode.next;
	}
	
}


int sizelist()
{
	return size;
}
}
public class testlink {

	public static void main(String[] args) {

		linkedl list  = new linkedl();
		
		int size = 5;
	     for(int i = 0; i < size; i++){
		   
	     Random random = new Random();

			  int d = random.nextInt(1+5);
			  
			  list.InsertData(d);
			  
	     }
	     
	     
	   
	     System.out.println("\nRandom Numbers.....");
	     list.printList();
	    
	  
	  	System.out.println("Quick Sort");
	  	
	  
	  	demo.linkedl.Node n = list.head;
	  	
	  	while(n.next != null)
	  	{
	  		n = n.next;
	  	}
	  	
	  	list.sort(list.head, n);
	  	list.printList();
	  	
	  	System.out.println("Shell sort");
	  	list.shellsort(size);
	  	list.printList();
	  	
		
	  	System.out.println("marge sort");
	  	 list.mergeSort(list.head);
	  	list.printList();
	  	
	  	
	  	
	}
		
	}


