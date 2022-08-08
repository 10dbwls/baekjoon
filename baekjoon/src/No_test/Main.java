package No_test;

abstract class Vehicle {
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : " + name;
	}
}

// Class name : Car
// extends Class : Vehicle (부모)
class Car extends Vehicle {
	private String name;
	
	// Car 클래스 생성자
	// 생성자 특징
	// - class와 이름이 같음
	// - return 값이 없음
	public Car(String val) {
		// Car 클래스의 변수 name과 부모 클래스의 변수 name에 값 부여
		name = super.name = val;
	}
	
	public String getName(String val) {
		return "Car name : " + val;
	}
	
	public String getName(byte[] val) {
		return "Car name : " + val;
	}
}

public class Main {
	public static void main(String[] args) {
		// Vehicle 객체 생성 (주체는 new 뒤에 나와있는 Car 클래스)
		Vehicle obj = new Car("Spark");
		System.out.println(obj.getName());
		// getName은 총 함수가 세개이다. Car 두개, Vehicle 한개
		// 단, 여기서 함수의 이름 뿐만 아니라 필요 값 까지 같아야 한다.
		// 그래서 getName과 이름이 같은 함수 세개중에서 빈 값을 가지는
		// Vehicle Class의 getName과 같다.
		// 그래서 출력 값은 Vehicle name : Spark
	}
}
