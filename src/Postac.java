import java.util.Scanner;

public class Postac {

	static Scanner scanner = new Scanner(System.in);

	private static String nameOfThePlayer;
	private static double health = 100;
	private static double healthMax = 100;
	private static double mana = 30;
	private static double manaMax = 30;
	private static double speedAttack = 1.0;
	private static double deffence = 5;
	private static double attack = 5;
	private static double money = 0;
	private static int level = 1;
	private static double exp = 0;

	private static double agility = 5;
	private static double intelligence = 5;
	private static double vitality = 5;
	private static double strength = 5;
	private static double crit = 1 * agility;

	//GETTERS
	public static String getName(){
		return nameOfThePlayer;
	}

	public static double getCrit(){
		return crit;
	}

	public static double getHealth(){
		return health;
	}

	public static double getHealthMax(){
		return healthMax;
	}

	public static double getMana(){
		return mana;
	}

	public static double getManaMax(){
		return manaMax;
	}

	public static double getAttack(){
		return attack;
	}

	public static double getAttackPower(){
		return attack*strength;
	}

	public static double getStrength(){
		return strength;
	}

	public static String getHealthBar(){
		return "Zycie: " + getHealth() + " / " + getHealthMax();
	}

	public static double getExp(){
		return exp;
	}

	public static double getMoney(){
		return money;
	}

	public static double getLvl(){
		return level;
	}

	public static double getIntelligence(){
		return intelligence;
	}

	//SETTERS
	public static void setName(String nameOfThePlayer){
		nameOfThePlayer = nameOfThePlayer;
	}

	public static void setHealth(double current, double max){
		health = current;
		healthMax = max;
	}

	public static void setMana(double current, double max){
		mana = current;
		manaMax = max;
	}

	public static void setAttack(double addAttack){
	    attack += addAttack;
    }

    public static void setMoney(double addMoney){
		money += addMoney;
	}

	public static void setExp(double addExp){
    	exp += addExp;
	}


	public Postac(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength, String nameOfThePlayer){
		this.nameOfThePlayer = nameOfThePlayer;
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

	public void champLevel(double exp) {
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

	public static boolean takeDamage(double damage) {
		health = getHealth() - damage;
		System.out.println(Monster.getNameOfTheMonster() + " zadal Ci: " + damage + ", punktow obrazen, masz teraz: " + getHealth() + " punktow zycia");
		System.out.println(getHealthBar());
		if (getHealth() <= 0) {
			System.out.println("Umarles");
			System.exit(1);
			return true;
		}
		return false;
	}

	public static void dealDamage() {
		System.out.println("Co chcesz teraz zrobic?");
		String fight = scanner.nextLine();

		if (fight.equals("fight")){
			System.out.println("Napierdolosz mieczem");
			physicAttack();
		}
		else if (fight.equals("magic") && mana > 15){
			System.out.println("Napierdalosz magia");
			magicAttack();
		}
		else if (fight.equals("magic") && mana < 15){
			System.out.println("Nie masz many na zaklecia");
			dealDamage();
		}
		else{
			System.out.println("Zla komenda");
			dealDamage();
		}


	}

	public static void magicAttack(){

		System.out.println("Jakiego zaklecia chcialbys uzyc?");
		String spell = scanner.nextLine();
		if (spell.equals("fireball")){
			Monster.takeDamage(HeroMagic.useFireBall());
		}
		else if (spell.equals("wzmocniony atak")){
			HeroMagic.useReinforcedAttack();
		}
		else if(spell.equals("leczenie")){
			HeroMagic.useHeal();
		}
		else if (spell.equals("help")){
			System.out.println("Dostepne zaklecia to: fireball, heal, wzmocniony atak");
			magicAttack();
		}
	}

	public static double physicAttack(){
		double damage = attack*strength;
		if(Random.Cryt() == true){
			damage *= 2;
			System.out.println("Zadales: " + damage + " punktow obrazen");
			Monster.takeDamage(damage);
		}
		else{
			System.out.println("Zadales: " + damage + " punktow obrazen");
			Monster.takeDamage(damage);
		}
		return damage;
	}

	public Postac(){

	}
}

