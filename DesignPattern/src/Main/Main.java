package Main;

import BuilderPattern.BuilderPattern;
import DelegatePattern.Avengers;
import DelegatePattern.Combatant;
import DelegatePattern.Shield;

public class Main {
	public static void main(String[] args) {
		BuilderPattern builderPattern = new BuilderPattern.Builder().a(1).b(2).c(3).d(4).build();
		
		Shield shield = new Shield();
		shield.executeMission();
		shield.rest();
		
		Avengers captainAmerica = new Combatant("captainAmerica");
		shield.delegateTo(captainAmerica);
		shield.executeMission();
		shield.rest();
	}
}