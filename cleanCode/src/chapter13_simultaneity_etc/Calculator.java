package chapter13_simultaneity_etc;


public class Calculator extends Thread {
	private Adder adder;
	private int calculatorNum;
	
	public Calculator(int calNum, Adder adder) {
		this.calculatorNum = calNum;
		this.adder = adder;
	}
	
	@Override
	public void run() {
		adder.addOneToTen(calculatorNum);
	}
}
