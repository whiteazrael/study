package DelegatePattern;

public class Shield implements Avengers {
	private Avengers avenger = new NonCombatant("nick fury");
	
	@Override
	public void executeMission() {
		avenger.executeMission();
	}

	@Override
	public void rest() {
		avenger.rest();
	}
	
	public void delegateTo(Avengers avenger) {
		this.avenger = avenger;
	}
}
