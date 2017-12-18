public class Weapons extends Items {

    public Weapons(int id, String name, double atk, double str, double crit) {
        super(id, name);
        Postac.setAttack(atk);
        Postac.setStrength(str);
        Postac.setCrit(crit);
    }

    public Weapons(){

    }

    Weapons zDupy = new Weapons(1, "Gowniany miecz", 3, 0, 100);
    Weapons chujogrom = new Weapons(0, "Chujogrom", 5, 6, 7);

    Weapons[] weaponArray = { chujogrom, zDupy };

    public int wypisz(){
        return chujogrom.id;
    }

}

