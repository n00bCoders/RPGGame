public class Armor extends Items {

    public Armor(int id, String name, double health, double deffence){
        super(id, name);
        Postac.setHealth(Postac.getHealth() + health, Postac.getHealthMax() + health);
        Postac.setDeffence(deffence);
    }

    Armor chujowa = new Armor(21, "Chujowa zbroja", 1000, 500);

    Armor gowniania = new Armor(22, "Gowniana zbroja", 2000, 1000);

}
