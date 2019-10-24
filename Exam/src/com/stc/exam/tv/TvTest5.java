package com.stc.exam.tv;

public class TvTest5 {
	public static void main(String[] args) {
		SamsungTv sstv = new SamsungTv();
		LGTv lgtv = new LGTv();
		
		mainshowState(sstv);
		mainshowState(lgtv);
		
	}
	
	public static void mainshowState(Tv tv) {
		tv.showState();
		
	}
}
