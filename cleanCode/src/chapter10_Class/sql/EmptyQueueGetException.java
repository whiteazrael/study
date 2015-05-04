package chapter10_Class.sql;

@SuppressWarnings("serial")
public class EmptyQueueGetException extends Exception {
	@Override
	public String getMessage() {
		return "큐가 비었습니다";
	}
}
