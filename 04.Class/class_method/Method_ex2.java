package class_method;

class Car {
	int speed;

	public Car() {
	}
	
	int getSpeed() {
		return speed;
	}
	
	void turnOn() {
		System.out.println("시동을 켭니다.");
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.printf("달립니다. (시속: %dkm/h)\n", speed);
		}
	}
}

public class Method_ex2 {

	public static void main(String[] args) {
		Car c = new Car();
		c.turnOn();
		c.run();
		int speed = c.getSpeed();
		System.out.printf("현재속도는 %dkm/h입니다\n", speed);

	}

}
