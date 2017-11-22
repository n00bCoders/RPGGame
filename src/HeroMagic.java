import javafx.geometry.Pos;

public class HeroMagic {

    public static double useFireBall(){
        double requiredMana = 20;
        double spellDamage = Postac.getLvl() * Postac.getIntelligence();

        if ( requiredMana > Postac.getMana() ){
            System.out.println("Twoja mana: " + Postac.getMana() + " Ni mosz many na fajer bola");
            return 0;
        }
        else{
            System.out.println("LVL: " + Postac.getLvl() + ", Inteligencja: " + Postac.getIntelligence());
            System.out.println("Uzyles FireBalla! i zadales: " + spellDamage + " punktow obrazen!");
            Postac.setMana((Postac.getMana()-requiredMana), Postac.getManaMax());
            return spellDamage;
        }
    }

    public static double useIceSpike(){
        double requiredMana = 40;
        double spellDamage = Postac.getLvl() * Postac.getIntelligence();

        if ( requiredMana > Postac.getMana() ){
            System.out.println("Ni mosz many, skurwysynu, na ajs spajka!");
            return 0;
        }
        else{
            System.out.println("Uzyles IceSpike! i zadales: " + spellDamage + " punktow obrazen!");
            Postac.setMana( (Postac.getMana() - requiredMana), Postac.getManaMax() );
            return spellDamage;
        }
    }

    public static void useHeal(){
        double requiredMana = 30;
        double spellDamage = Postac.getLvl() * Postac.getIntelligence();

        if (requiredMana > Postac.getMana() ){
            System.out.println("Nie uleczysz dzis swej pizdy");
        }
        else{
            if (spellDamage >= Postac.getHealthMax() - Postac.getHealth() ){
                spellDamage = Postac.getHealthMax() - Postac.getHealth();
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Postac.setHealth(Postac.getHealth() + spellDamage, Postac.getHealthMax() );
                Postac.setMana( (Postac.getMana() - requiredMana), Postac.getManaMax() );
                System.out.println("Heal byl wiekszy niz Twoje hp");

            }
            else{
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Postac.setHealth(Postac.getHealth() + spellDamage, Postac.getHealthMax() );
                Postac.setMana( (Postac.getMana() - requiredMana), Postac.getManaMax() );
            }
        }
    }

    public static void useStealHealth(){
        double requiredMana = 15;
        double spellDamage = Postac.getLvl() * Postac.getIntelligence();

        if (requiredMana > Postac.getMana() ){
            System.out.println("Juz chcioles zajebac hapsy");
        }
        else{
            if (spellDamage >= Postac.getHealthMax() - Postac.getHealth() ){
                spellDamage = Postac.getHealthMax() - Postac.getHealth();
                System.out.println("Uleczyles sie za: " + spellDamage + " jego punktow zycia");
                Postac.setHealth(Postac.getHealth() + spellDamage, Postac.getHealthMax() );
                Postac.setMana( (Postac.getMana() - requiredMana), Postac.getManaMax() );
                System.out.println("Heal byl wiekszy niz Twoje hp");
            }
            else{
                System.out.println("Uleczyles sie za: " + spellDamage + " Twoich punktow zycia");
                Postac.setHealth( Postac.getHealth() + spellDamage, Postac.getHealthMax() );
                Postac.setMana( (Postac.getMana()-requiredMana), Postac.getManaMax() );
            }

        }

    }

    public static void useReinforcedAttack(){
        double damage = Random.RInt(Postac.getAttackPower() * 1, Postac.getAttackPower() * 5);
        Monster.takeDamage(damage);
    }

}
