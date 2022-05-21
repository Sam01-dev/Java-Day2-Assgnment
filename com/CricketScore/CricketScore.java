package com.CricketScore;

public class CricketScore {
	
	static void total(int on,int tw, int thr, int fo, int si) {
		
		int one = 1;
		int two = 2;
		int three = 3;
		int four = 4;
		int six = 6;
		
		System.out.println((on*one)+(two*tw)+(three*thr)+(four*fo)+(six*si));
	}

	public static void main(String[] args) {
		total(4, 5, 2, 1, 8);

	}

}
