package interface_;

interface RemoteControl {
	int max_volume = 10;
	int min_volume = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("베터리를교체합니다.");
	}
}

class Tv implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV켭니다");
	}
	
	public void turnOff() {
		System.out.println("Tv끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.max_volume) {
			this.volume=RemoteControl.max_volume;
		} else if(volume<RemoteControl.min_volume) {
			this.volume=RemoteControl.min_volume;
		} else {
			this.volume=volume;
		}
		System.out.printf("현재TV볼륨 = %d", this.volume);
	}
}

public class Interface_Ex1 {

	public static void main(String[] args) {
		RemoteControl rc = new Tv();
		

	}

}
