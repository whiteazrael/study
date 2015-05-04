package chapter13_simultaneity_etc;

public class Adder {
	private Integer total;
	private Object[] lock = new Object[0];
	
	public Adder() {
		this.total = 0;
	}
	
	public void addOneToTen(final int calNum) {
		System.out.println(calNum + "번 계산기 덧셈 시작");
		
		synchronized (lock) {
			total = 0;
			for (int i = 1; i <= 1000; i++) {
				total+=i;
			}
		}
		
		System.out.println(calNum + "번 계산기 덧셈 결과 : " + total);
	}
}
