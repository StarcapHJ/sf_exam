package com.stc.exam.tv;

public class SamsungTv extends Tv{
	@Override
	void channelUP() {
		channel += 5;
	}
	
	@Override
	public String toString() {
		return String.format("%s의 채널 : %d 볼륨:%d", "삼성",channel,volume);
	}

}
