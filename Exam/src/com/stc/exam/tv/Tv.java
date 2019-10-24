package com.stc.exam.tv;

public class Tv {
	protected int channel;
	protected int volume;
	
	
	
	Tv(int channel, int volume){
		this.channel = channel;
		this.volume = volume;
	}	
	
	Tv(){
		
	}
	
	public int getChannel() {
		return channel;
	}



	public void setChannel(int channel) {
		if (channel > 0 && channel < 300) {
			this.channel = channel;
		}
		else if(channel < 0) {
			this.channel = 0;
		}
		else if (channel > 300){
			this.channel = 300;
		}
		
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		if (volume > 0 && volume < 20) {
			this.volume = volume;
		}
		else if(volume < 0) {
			this.volume = 0;
		}
		else if (volume > 20){
			this.volume = 20;
		}
	}

	void showState() {
		System.out.printf("channel : %d, volume: %d\n",channel,volume);
	}
	
	void channelUP() {
		channel++;
	}
	void channelDOWN() {
		 channel--;
	}
	void volumeUP() {
		volume++;
	}
	void volumelDOWN() {
		volume--;
	}
}
