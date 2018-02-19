package enemy;

public enum Enemies {
	
	Klingon(null, 85, 80, 8, 5), Romulan(null, 75, 95, 6, 9), Gorn(null, 100, 60, 6, 10), GeneticEngineered(null, 100, 100, 10, 10);
	
	private String name;
	private int health;
	private int stamina;
	private int attack;
	private int defence;
	
	
	Enemies(String name, int health, int stamina, int attack, int defence) {
		
		this.setName(name);
		this.setHealth(health);
		this.setStamina(stamina);
		this.setAttack(attack);
		this.setDefence(defence);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	

}
