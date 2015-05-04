package chapter13_simultaneity_2_1;

public class DeliveryCompanyThread extends Thread {
	private String rank;
	private Car car;
	
	public DeliveryCompanyThread(String rank) {
		super();
		this.rank = rank;
		this.car = new Car();
	}

	public DeliveryCompanyThread(String rank, Car car) {
		super();
		this.rank = rank;
		this.car = car;
	}

	public void run() {
		car.drive(rank);
	}
}