package com.Ian;

import java.util.Random;

public class Poker {
	//int[] cards = new int[52];
	Card[] cards=new Card[52];

	public Poker() {
		for (int i = 0; i < 52; i++) {
			//cards[i] = i;
			//"for" this process is to print i from 0 to 51
			cards[i]=new Card(i);
		}
	}
	

	
		
	
	public void shuffle(){
		for(int i=0;i<52;i++){
			int r = new Random().nextInt(52);
			//a = cards[i]
			//b = cards[r]
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}
	
	
	
		

	
		
		
		
	

	public void print() {

		for (int i = 0; i < 52; i++) {
			//int flower = cards[i] / 13;
			//char f = 0;
			//switch (flower) {
			//case 0:
				//f = 'S';
				//break;
			//case 1:
			//	f = 'H';
			//	break;
			//case 2:
				//f = 'D';
				//break;
			//case 3:
				//f = 'C';
				//break;
			
		
			//System.out.print((cards[i] % 13 + 1) + " " + f + " ");
			//"i%13+1"this process is to print i from 1 to 13
		
		System.out.print(cards[i].get()+"");
		
			if (i % 13 == 12)
				System.out.println();
			//"if"this process is for when reaching 13,it changes to another line.
		}
	}
}
	

