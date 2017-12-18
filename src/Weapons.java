public class Weapons extends Items{

    public Weapons(int id, String name, double atk, double str, double crit){
        super(id, name);
        Postac.setAttack(atk);
        Postac.setStrength(str);
        Postac.setCrit(crit);
    }

    Weapons chujogrom = new Weapons(1, "Chujogrom", 5, 6, 7);

}
