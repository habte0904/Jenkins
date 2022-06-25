package project;

import java.util.Random;
public class RollDice {
	 public static int die1;   // The number on the first die.
	 static int die2;   // The number on the second die.
	 static int roll;   // The total roll (sum of the two dice).
     
	    public static void main(String[] args) {
	    	int d1, d2, r;   
	    	RollDice rd = new RollDice();
	    	
	        d1 = rd.returnRandom();
	        d2 = rd.returnRandom();
	        r = d1 + d2;
	        
	        System.out.println("Roll 1#: " + d1);
	        System.out.println("Roll 2#: " + d2);
	        System.out.println("The Total is: " + r);

	    }  
	    
	    public int returnRandom() {
	    	int max = 6;
			int min = 1;
			Random random = new Random();
			int rd = min + random.nextInt(max);
					
			
	    	return rd;
	    }

}
