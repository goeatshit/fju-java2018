package com.Ian;

	import java.util.Random;

	public class PokerGame {

		public static void main(String[] args) {
			//int[] flowers={0x2663,0x2666,0x2665,0x2660};
	        int[] nums=new int[5];
	        nums[0]=5;
	        nums[4]=10;
	        System.out.println(nums[4]);
	        System.out.println(nums.length);
	        for(int i=0; i< nums.length;i++){
	        	System.out.println(i);
	        }
	        	
	        
	        
			//char m=0x2666;
			//System.out.print(m);
			int r=0;
			for(r=0;r<52;r++){		
			Random ran = new Random();
			int poker =ran.nextInt(12);
		    int flower=ran.nextInt(4);
		    System.out.print(poker);
		    char f=0;
		    switch(flower){
		    case 0:
		    	f='S';
		        break;
		    case 1:
		        f='H';
		        break;
		    case 2:
		    	f='D';
		    	break;
		    case 3:
		    	f='C';
		    	break;
		  
		    
		    }
		    System.out.println(f);
			
			}
		}
	}
		
			
	

		


