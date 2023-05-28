package demo;
import java.util.Random;
import java.util.Scanner;


class lab11{
	
	int Node[];
	int maxsize;
	int nelemt;
	
	public lab11(int size) 
	{
		this.maxsize = size;
		Node = new  int[maxsize];
	    nelemt = 0;
	}
	
	void insertData(int data)
	{
		
		Node[nelemt] = data;
		nelemt++;
		
	}
	
	void quicksortSample()
	{
		int n = Node.length;
		quicksort(Node, 0, n-1);
	

	}
	
	void margeSortSample()
	{
		int n = Node.length;
		divide(Node, n,n-1);
		
	}
	
	//...qUICKSORT
 void quicksort(int[] a, int low, int high) {

		if(low<high)
		{
			int povit = portition(a,low,high);
			quicksort(a,low, povit-1);
			quicksort(a,povit+1, high);
			
		}
		
	}
	
	
	private static int portition(int[] a, int low, int high) {
		   
		int povit = a[high];
		int i = low-1;
		
		
		for(int j = low; j<high;j++)
		{
			if(a[j] < povit)
			{
			    i++;
				int temp; 
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
				
			
		}
		i++;
		int temp = a[i];
		a[i] = povit;
		a[high] = temp;
		return i;
	}
// ending squick sort

	private static void divide(int[] arr, int si, int ei) 
	{
		if(si>=ei) {
			return;
		}
		
		int mid = si+(ei-si)/2; 
		divide(arr,si, mid); 
		divide(arr, mid+1, ei); 
		
		conquer(arr,si,mid, ei);
		
	}
	
private static void conquer(int[] arr, int si, int mid, int ei) 
   {
	
	// new array
	int marged[] = new int[ei-si+1];
	
	int ind1 = si;
	int ind2 = mid+1;
	int x = 0;
	
	
	while(ind1 <= mid && ind2 <=ei) { // 0(n)
      
		if(arr[ind1]<= arr[ind2])
       {
   		marged[x++] = arr[ind2++];
   		
       }
       else {
      		marged[x++] = arr[ind2++];
       }
       
	}
	
	while(ind1<=mid)
	{
  		marged[x++] = arr[ind1++];
	}

	while(ind2<=ei)
	{
  		marged[x++] = arr[ind2++];
	}
	
	
	
	// print 

	
	 for(int i= 0, j=si;  i<marged.length; i++,j++) {
		 
		 arr[j] = marged[i];
	 }
	}
	
	
	

void shell_sort()
{
  int n = Node.length;
  
  for(int gap = n/2;gap>0;gap/=2)
  {
	  
	  for(int i = gap ; i<n; i++)
	  {
		  
		  int temp = Node[i];
		  
		  for(int j = i ; j>=gap && Node[j-gap]>temp; j = j-gap)
		  {
			  Node[j] = Node[j-gap];
			  Node[j] = temp;

		  }
		 
		  ///
		  
	  
	  }  return;
	  
  }
}
	
	
//
	void printData()
	{
		
		for(int i : Node)
			System.out.print(i+" ");
	}
	
	
}
public class testApp {
	public static void main(String[] args) {
		
		long start_time = System.nanoTime();
  		System.out.println("\n-----------------------------------------");
  		
  		System.out.println("\nWELCOME TO THE SORTING PORTAL");
  		
  		System.out.println("\n-----------------------------------------");


		final int size = 30;
		lab11 lab = new lab11(size);
		
		
		System.out.println("=====Ramdom Numbers=====\n");
		//Random rand = new Random();

	     for(int i = 0; i < size; i++){
		   
	     Random random = new Random();

			  int d = random.nextInt(1+1000);
			  
			  lab.insertData(d);
			  
			 // lab.quicksort(, d, i);

	     }
	    
	     
          lab.printData(); 
    	
         System.out.println("\n-----------------------------------------------------------------------------------------------------------");
 	     System.out.println("\nQuicksort");
          lab.quicksortSample();
          lab.printData();
           
    	 System.out.println("\n----------------------------------------------------------------------------------------------------------");
  	     System.out.println("\nMarger sort");
         lab.margeSortSample();
         lab.printData();
         
   	
         System.out.println("\n--------------------------------------------------------------------------------------------------------");
  	     System.out.println("\nShell sort");
         lab.shell_sort();
         lab.printData();

         
         
  		long ending_time = System.nanoTime();

         
  		long tatal_time = ending_time - start_time;
  		 
  		System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------");
  		System.out.println("\nTotal time cunsumed : "+start_time+" NanoSecds ");
  		System.out.println("\nTotal time cunsumed : "+ending_time+" NanoSecds");
  		System.out.println("\nTotal time cunsumed : "+tatal_time+" NanoSecds");
  		
  		System.out.println("-----------------------------------------");

  		 
          
          System.out.println();

	}



}
