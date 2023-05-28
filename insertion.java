package demo;

public class insertion {
public static void main(String[] args) {

	int A[] = {7,2,4,1,5,3};
	//int n = A.length;
	
	
	  for(int i:A){    
          System.out.print(i+" ");    
      }    
      System.out.println();    
  
	
    insertionSort(A);//sorting array using insertion sort    
    System.out.println("After Insertion Sort");    
    for(int i:A){    
        System.out.print(i+" ");    
    }    
	
}

private static void insertionSort(int[] arr) {
 
	int n = arr.length;

	for(int i=1;i<n;i++)
	{
		int value = arr[i];
		int hole = i;
		
	while(hole>0 && arr[hole-1]>value)
	{
		arr[hole] = arr[hole-1];
		hole--;
	}
	
	arr[hole] = value;
	}
}
}
