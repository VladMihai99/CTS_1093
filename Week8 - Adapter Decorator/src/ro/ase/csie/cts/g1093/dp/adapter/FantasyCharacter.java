package ro.ase.csie.cts.g1093.dp.adapter;

public class FantasyCharacter extends ACMECharacter{

	public FantasyCharacter(String name, int lifePoints) {
		super(name, lifePoints);
	}

	public void move() {
		System.out.println(String.format("%s is moving", name));
		
	}

	public void takeAHit(int points) {
		System.out.println(String.format("%s takes a hit of %d points", name, points));
		this.lifePoints -= points;
	}

	public void heal(int points) {
		System.out.println(String.format("%s heals %d points", name, points));
		this.lifePoints += points;
	}
	
	

}
