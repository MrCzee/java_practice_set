package demo;
public class IULinkedList<T> { 
	
	
    private Node<T> head;
    private int count;
    
     IULinkedList(T Val)
    {
     count = 0; 
	 head = new Node();
      head.SetVal(Val); 
    }

 
  void addLast(T Val)
 {
	count++;
	 Node<T> n = new Node<T>();
	 n.SetVal(Val);
	 Node<T> temp = head;
	 while(temp.GetNext() != null)
	 {
		 temp = temp.GetNext();
	 }
	
	 temp.SetNext(n);  
 }
 
 public int search(T Element)
 {

     if (head.GetNext() == null) {
    	 System.out.println("Lint is Empty Add items in list");
     }
     
     int index = 0;
	  Node<T> temp = head;
	  
	  while (temp.GetNext() != null) {
		  
          if (temp.GetVal() == Element) {
              return index;
          }
          
          index++;
          temp = temp.GetNext();
      }
	     return -1;
     }
     
 
 void addFirst(T Val) {

	 Node<T> newNode = new Node<T>();
	   newNode.SetVal(Val);
       newNode.SetNext(head);
       head = newNode;
       count++;
 }
 
 void RemoveFirst(){
	 if(head.GetNext() == null)
	 {
		 System.out.println("Empty List");
	 }
	 
	 head = head.GetNext();
	 
 }
 
 
 
 T get(int index)
 {
	  Node<T> temp = head;
	 if(index>-1 && index<=count)
	 {
		 for(int i=0;i<index;i++)
		 {
			 temp = temp.GetNext();
		 }
	 }
	return temp.GetVal();
 }
 
 
 
 
 
 
 public String toString()
 {
	
	Node<T> pri= head;
		String s=pri.GetVal()+"  ";
		while(pri.GetNext() != null)
		{
			pri = pri.GetNext();
			s=s+pri.GetVal()+ "  ";
		}
	 
	return s;
 }
 
 
 
}