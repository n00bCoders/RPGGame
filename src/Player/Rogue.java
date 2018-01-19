package Player;

import Player.Player;

public class Rogue extends Player {

    public Rogue(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength, String nameOfThePlayer) {
        super(health * 0.8, healthMax * 0.8, mana, manaMax, speedAttack * 1.1, deffence - 3, attack + 1, agility + 5, intelligence, vitality - 2,  strength, nameOfThePlayer);

    }
}
