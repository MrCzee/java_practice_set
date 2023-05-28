package te;
import java.util.Scanner;
public class array {
    int arr[];
    int maxsize;
    int top;
    
    public array(int size)
    {
    	maxsize = size;
    	arr = new int[maxsize];
    	top = -1; //impty
    }
    
    void push(int data) // insert
    		{
            if(isFull()) {
            	System.out.println("Stack is Full");
            }
            
            arr[++top] = data;
        	System.out.println("Data is successfullly inserted:"+data);

    	
    		}
    
    
    
    
    private boolean isFull() {
		// TODO Auto-generated method stub
		return top == maxsize-1;
	}

	int pop() // delete
    {
		
		if(isEmpty())
		{
        	System.out.println("Stack is Empty");

		}
		
		int temp  = arr[top--];
		
		System.out.println("Data poped: "+temp);
		return temp;
    	
    }
    private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}

	int top() // return in the top
    {
		return arr[top];
    	
    }
	
	
	void printValues()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
    public static void main (String[] args)
    {
    	
    	//Scanner key = new Scanner(System.in);

    	array arr1 = new array(5);
    
    	
    	//for (int i; )
    	arr1.push(3);
    	arr1.push(20);
    	arr1.push(3);
    	arr1.push(20);
    	
    	
    	arr1.pop();
    	
    	arr1.pop();    	
    	arr1.pop();
    	
    	arr1.printValues();

    }
    
}
