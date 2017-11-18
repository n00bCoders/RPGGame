public class Wojownik extends Postac {

	public Wojownik(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength) {
		super(health + 50, healthMax + 50, mana - 20, manaMax - 20, speedAttack, deffence + 5, attack + 5, agility, intelligence - 5, vitality + 3,  strength + 5);
	}


}