package DelegatePattern;

public class NonCombatant implements Avengers {
	private String name;
	
	public NonCombatant(String name) {
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
