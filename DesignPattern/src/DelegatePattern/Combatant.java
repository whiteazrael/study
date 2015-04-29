package DelegatePattern;

public class Combatant implements Avengers {
	private String name;
	
	public Combatant(String name) {
		this.name = name;
	}
	
	@Override
	public void executeMission() {
		System.out.println(name + " execute mission.");
	}

	@Override
	public void rest() {
		System.out.println(name + " rest in the home.");
	}
}
