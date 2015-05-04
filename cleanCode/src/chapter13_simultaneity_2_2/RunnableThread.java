package chapter13_simultaneity_2_2;

public class RunnableThread implements Runnable {
	String seq = null;

	public RunnableThread(String seq) {
		this.seq = seq;
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt < 5; cnt++) {
			System.out.println(seq + ":" + cnt);
		}
	}
}