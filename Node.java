package demo;

public class Node<T> { 

       private Node next;
       private T Val;
	
	
	
	Node GetNext()
	{
		return next;
	}
	
	void SetNext(Node next)
	{
		this.next = next;
	}
	
	
	T GetVal()
	{
		return Val;
	}
	
	void SetVal(T Val)
	{
		this.Val = Val;
	}
	
	
}