package com.stc.exam.tv;

public class TvTest3 {
	
	public static void main(String[] args) {
		
		LGTv tv1 = new LGTv("XE-123");
		
		
		Tv tv = tv1;
		
		tv.showState();
		
	}
}
