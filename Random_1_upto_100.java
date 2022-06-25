package project;
import java.util.*;
public class Random_1_upto_100 {

	public static void main(String[] args) {
		int [] ra = new int[10];
		int max = 100;
		int min = 1;
		try (Scanner sc = new Scanner(System.in)) {
			for(int i =0;i<10; i++) {
				Random random = new Random();
				int r_number = min + random.nextInt(max);
				ra[i]=r_number;
			}
	
			//guess value
			int tr=1;
			while(tr<=5) {
				//System.in is a standard input stream.
				System.out.println("\nEnter a Number to see if it's in the array");
				int a= sc.nextInt();
				System.out.println(a);
			    int m = lSearch(ra, a);
			    
			    if(m != -1){    
	                System.out.println(a +" was found in the array at index: " + m); 
	            }    
			    else {
			    	 System.out.println(a+ " Was not found in the array - TRY AGAIN");  
					    
			    }
	       
				int n = 5- tr;
				System.out.println("you have "+ n +" tries left");
				System.out.println("***********************************************");
				
				tr ++;
			}
			
			System.out.println("The Array Contains the following numbers:\n");
			for(int i =0;i<10; i++) {
				
				System.out.print(ra[i] + "\n");
			}
			
		}
		
		
	}
	
	public static int lSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i; 
            }    
        }    
        return -1;  
    }   

}
