package demo;
import java.util.Scanner;
public class test { 

	
	public static void main(String arg[])
	{
		IULinkedList<Integer> one = new IULinkedList<Integer>(30);
		Scanner sc = new Scanner(System.in);
		
        System.out.println("\n\t\t\t\t==============");
        System.out.println("\t\t\t\tI'M LINKEDLIST");
        System.out.println("\t\t\t\t==============");

		one.addFirst(20);
		one.addLast(40);
		one.addFirst(10);
		one.addLast(50);
       
		
		System.out.println(one);
		
		 System.out.println("Enter value for searching here?");
		 int key = sc.nextInt();
		 int findKey = one.search(key);

		
	    System.out.println("\n=====================");


		
		System.out.println("\n\nSearching values is: "+key);
		
		 if (findKey == -1) 
	            System.out.println("\nElement not found in the Linked List");
	        else
	            System.out.println("\nElement found at index "+ findKey);


		 System.out.println("\n=====================");
		 System.out.println("System terminated....");
		 System.out.println("=====================");


	    }

	}
	
	
	
	
