package Fighting;

import Additional.Random;
import Game.Player;
import Monsters.Monster;

public class HeroMagic {

    public static double useFireBall(){
        double requiredMana = 20;
        double spellDamage = Player.getLvl() * Player.getIntelligence();

        if ( requiredMana > Player.getMana() ){
            System.out.println("Twoja mana: " + Player.getMana() + " Ni mosz many na fajer bola");
            Player.dealDamage();
        }
        else{
            System.out.println("Uzyles FireBalla! i zadales: " + spellDamage + " punktow obrazen!");
            Player.setMana((Player.getMana()-requiredMana), Player.getManaMax());
            return spellDamage;
        }
        return -1;
    }

    public static double useIceSpike(){
        double requiredMana = 40;
        double spellDamage = Player.getLvl() * Player.getIntelligence();

        if ( requiredMana > Player.getMana() ){
            System.out.println("Ni mosz many, skurwysynu, na ajs spajka!");
            return 0;
        }
        else{
            System.out.println("Uzyles IceSpike! i zadales: " + spellDamage + " punktow obrazen!");
            Player.setMana( (Player.getMana() - requiredMana), Player.getManaMax() );
            return spellDamage;
        }
    }

    public static void useHeal(){
        double requiredMana = 30;
        double spellDamage = Player.getLvl() * Player.getIntelligence();

        if (requiredMana > Player.getMana() ){
            System.out.println("Nie uleczysz dzis swej pizdy");
        }
        else{
            if (spellDamage >= Player.getHealthMax() - Player.getHealth() ){
                spellDamage = Player.getHealthMax() - Player.getHealth();
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Player.setHealth(Player.getHealth() + spellDamage, Player.getHealthMax() );
                Player.setMana( (Player.getMana() - requiredMana), Player.getManaMax() );
                System.out.println("Heal byl wiekszy niz Twoje hp");

            }
            else{
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Player.setHealth(Player.getHealth() + spellDamage, Player.getHealthMax() );
                Player.setMana( (Player.getMana() - requiredMana), Player.getManaMax() );
            }
        }
    }

    public static void useStealHealth(){
        double requiredMana = 15;
        double spellDamage = Player.getLvl() * Player.getIntelligence();

        if (requiredMana > Player.getMana() ){
            System.out.println("Juz chcioles zajebac hapsy");
        }
        else{
            if (spellDamage >= Player.getHealthMax() - Player.getHealth() ){
                spellDamage = Player.getHealthMax() - Player.getHealth();
                System.out.println("Uleczyles sie za: " + spellDamage + " jego punktow zycia");
                Player.setHealth(Player.getHealth() + spellDamage, Player.getHealthMax() );
                Player.setMana( (Player.getMana() - requiredMana), Player.getManaMax() );
                System.out.println("Heal byl wiekszy niz Twoje hp");
            }
            else{
                System.out.println("Uleczyles sie za: " + spellDamage + " Twoich punktow zycia");
                Player.setHealth( Player.getHealth() + spellDamage, Player.getHealthMax() );
                Player.setMana( (Player.getMana()-requiredMana), Player.getManaMax() );
            }

        }

    }

    public static void useReinforcedAttack(){
        double requiredMana = 30;

        double damage = Random.RInt(Player.getAttackPower() * 1, Player.getAttackPower() * 5);


        System.out.println("Użyłes wzmocnionego ataku i zadałeś: " + damage + " punktów obrażeń!");
        Monster.takeDamage(damage);
    }

}
