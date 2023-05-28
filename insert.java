package demo;

public class insert {
public static void main(String[] args) {
	int[] a = {9,4,56,44,6};
	
	
	
	System.out.println("Unsorted Group");
	for(int i : a)
     System.out.print(i+" ");
     
     insertSort(a);
     
     System.out.println("\nAfter insertion sorted");
      
     for(int i: a)
    	 System.out.print(i+" ");
     
}

private static void insertSort(int[] a) {

	int n = a.length;
	
	for(int i=1;i<n;i++) {
		
		int value = a[i];
		
		int temp = i;

	    while(temp>0 && a[temp-1]>value) 
	    {
	    	a[temp] = a[temp-1];
	    
	    temp--;
	    }
		a[temp] = value;

	}
	
	
}
}
