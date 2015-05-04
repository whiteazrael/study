package chapter13_simultaneity_2_2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class SequentialExecutor implements Executor {
	final Queue<Runnable> queue = new ArrayDeque<Runnable>();
	Runnable task;

	public synchronized void execute(final Runnable runnable) {
		queue.offer(new Runnable() {
			public void run() {
				try {
					runnable.run();
				} finally {
					next();
				}
			}
		});
		
		if (task == null) {
			next();
		}
	}

	private synchronized void next() {
		if ((task = queue.poll()) != null) {
			new Thread(task).start();
		}
	}
}