package com.stc.exam.tv;

public class TvTest {
	
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(10,5);
		
		
//		tv1.channel = 10;
//		tv1.volume = 10;
		
		Tv tv2 = new Tv();
		
		tv2.setChannel(10);
		tv2.setVolume(10);
//		tv2.channel = 20;
//		tv2.volume = 20;
		
		tv1.showState();
		tv2.showState();
		
		int volume = tv2.getVolume();
		
		System.out.println("");
		
	}
	
}
