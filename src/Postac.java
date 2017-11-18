public class Postac {

	private static double health = 100;
	private static double healthMax = 100;
	private static double mana = 30;
	private static double manaMax = 30;
	private static double speedAttack = 1.0;
	private static double deffence = 5;
	private static double attack = 5;
	public double money = 0;
	public int level;
	public double crit = 1;

	public double exp = 0;

	private static double agility = 5;
	private static double intelligence = 5;
	private static double vitality = 5;
	private static double strength = 5;

	public static double getHealth(){
		return health;
	}

	public static double getHealthMax(){
		return healthMax;
	}

	public static double getAttack(){
		return attack;
	}

	public static double getStrength(){
		return strength;
	}

	public String getHealthBar(){
		return "Zycie: " + getHealth() + " / " + getHealthMax();
	}

	public static void setHealth(double current, double max){
		health = current;
		healthMax = max;
	}


	public Postac(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength){
		this.health = health;
		this.healthMax = healthMax;
		this.mana = mana;
		this.manaMax = manaMax;
		this.speedAttack = speedAttack;
		this.deffence = deffence;
		this.attack = attack;
		this.agility = agility;
		this.intelligence = intelligence;
		this.vitality = vitality;
		this.strength = strength;
	}

	public void level(double exp) {
		if (exp < 200) {
			this.level = 1;
			System.out.println("Twoj level wynosi 1 ");
		}
		if (exp >= 200 && exp < 300) {
			this.level = 2;
			System.out.println("Twoj level wynosi 2 ");
		}
		if (exp >= 300 && exp < 400) {
			this.level = 3;
			System.out.println("Twoj level wynosi 3 ");
		}
		if (exp >= 400 && exp < 500) {
			this.level = 4;
			System.out.println("Twoj level wynosi 4 ");
		}
		if (exp >= 500 && exp < 600) {
			this.level = 5;
			System.out.println("Twoj level wynosi 5 ");
		}
		if (exp >= 600 && exp < 700) {
			this.level = 6;
			System.out.println("Twoj level wynosi 6 ");
		}
		if (exp >= 700 && exp < 800) {
			this.level = 7;
			System.out.println("Twoj level wynosi 7 ");
		}
		if (exp >= 800 && exp < 900) {
			this.level = 8;
			System.out.println("Twoj level wynosi 8 ");
		}
		if (exp >= 900 && exp < 1000) {
			this.level = 9;
			System.out.println("Twoj level wynosi 9 ");
		}
	}

	public boolean takeDamage(int damage) {
		health -= damage;
		System.out.println(Monster.getNameOfTheMonster() + " zadal Ci: " + damage + ", punktow obrazen, masz teraz: " + health + " punktow zycia");
		setHealth(getHealth() - damage, getHealthMax());
		if (health <= 0) {
			System.out.println("Umarles");
			return true;
		}
		return false;
	}

	public static void dealDamage() {
		double damage = getAttack()*getStrength();
		System.out.println("Zadales: " + damage + " punktow obrazen");
		Monster.takeDamage(damage);
	}

	public Postac(){

	}
}

