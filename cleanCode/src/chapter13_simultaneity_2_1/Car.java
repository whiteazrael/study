package chapter13_simultaneity_2_1;

public class Car {
	private static int totalCarNumber = 0;
	private int carNumber;
	
	public Car() {
		totalCarNumber++;
		carNumber = totalCarNumber;
	}
	
	public synchronized void drive(String rank) {
		System.out.println(rank + "님 " + carNumber + "번 차 운행 시작");
		for (int i = 0; i < 100000; i++) {
			if (i == 10000) {
				System.out.println(rank + " 님 운행 완료");
			}
		}
		System.out.println(rank + "님 " + carNumber + "번 차 하차완료");
	}
}