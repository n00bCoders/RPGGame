
public class Weapon {

    public static String weapon(int index1){ // tablica zawierajaca wszystkie bronie

        String[] weapon = new String[45];
        weapon[0] = "zardzewialy miecz";
        weapon[1] = "zardzewialy dlugi miecz";

        return weapon[index1];

    }
    public static void SendStats(){ // metoda ktora sprawdza zalozony item i przesyla odpowiednie wartosci do postaci
        switch (zalozone.wear[0][0]){
            case "zardzewialy miecz":
        Postac.setAttack(5);
        }
    }


}
