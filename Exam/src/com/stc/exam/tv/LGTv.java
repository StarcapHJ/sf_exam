package com.stc.exam.tv;

public class LGTv extends Tv{
	
	public String model;


	public LGTv(String lgstr) {
		model = lgstr;
	}

	public LGTv() {
		// TODO Auto-generated constructor stub
	}

	public void record() {
		System.out.println("녹화중입니다");
	}
	
	@Override
	void showState() {
		System.out.println("!!!안농");
	}

	@Override
	public String toString() {
		return "LGtv임!! ㅋㅋㅋ";
	}
	
	
	
}
