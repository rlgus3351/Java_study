package test;

public class Tv {
	// 필드
	int channel;
	String color;

	public int channelUp() {
		return channel++;
	}

	public int channelDown() {
		return channel--;
	}

	public void print() {
		System.out.printf("Tv의 현재 채널은 : %d이고, Tv의 색깔은 : %s 입니다.\n", channel, color);
	}

	// 기본 생성자
	public Tv() {

	}

	// 생성자
	public Tv(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}

}
