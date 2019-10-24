package com.stc.exam.tv;

public class TvTest2 {
	
	public static void main(String[] args) {
		LGTv lgtv1 = new LGTv(null);
		lgtv1.showState();
		lgtv1.channelUP();
		lgtv1.channelUP();
		lgtv1.channelUP();
		lgtv1.record();
		lgtv1.showState();
		
		LGTv lgtv2 = new LGTv(null);
		SamsungTv smtv2 = new SamsungTv();
		
		System.out.println(lgtv2.toString());
		System.out.println(smtv2);
		
		
		SamsungTv smtv1 = new SamsungTv();
		smtv1.volumeUP();
		smtv1.channelUP();
		smtv1.channelUP();
		smtv1.showState();
		
	}

}
