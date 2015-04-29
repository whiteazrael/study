package Main;

import BuilderPattern.BuilderPattern;
import DelegatePattern.Avengers;
import DelegatePattern.Shield;

public class Main {
	public static void main(String[] args) {
		BuilderPattern builderPattern = new BuilderPattern.Builder().a(1).b(2).c(3).d(4).build();
		
		Avengers shield = new Shield();
	}
}