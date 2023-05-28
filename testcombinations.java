package demo;

import java.util.*;   

public class testcombinations {  
    public static void PermutationList(int[] num){  
        actualFinder(num, 0);  
    }  
  
    private static void actualFinder(int[] num, int pos){  
        if(pos >= num.length - 1){   
            System.out.print("[");  
            for(int i = 0; i < num.length - 1; i++){  
                System.out.print(num[i] + ", ");  
            }  
            if(num.length > 0)   
                System.out.print(num[num.length - 1]);  
            System.out.println("]");  
            return;  
        }  
  
        int count = 0;
        for(int i = pos; i < num.length; i++){   
          
            int temp = num[pos];  
            num[pos] = num[i];  
            num[i] = temp;  
  
            actualFinder(num, pos+1);  
            count++;
            temp = num[pos];  
            num[pos] = num[i];  
            num[i] = temp;  
        }  
        
       
        if(count == 3) {
    		System.out.println("Counted values are : "+count);
    	}
        
        
    	
    }  
    public static void main(String args[]) { 
    	
    	System.out.println("=================");
    	System.out.println("Combinations are");
    	System.out.println("=================");

      int[] arr = {1,2,3}; 
   
     
      PermutationList(arr);  
    }  
}  

