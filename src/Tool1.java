public class Tool1 {
    public static String[][] equipment = new String[50][50];

    public static void add(int itemID, int index1, int index2){
        equipment[index1][index2] = others.othe(itemID);
    }
    public static void addkeys(int itemID, int index1, int index2){
        equipment[index1][index2] = Key1.klucz(itemID);
    }


public static String eq(int ID, int ID2){

    return equipment[ID][ID2];

}
}

//class Key extends Tool{}
//class Weapon extends Tool{}
//class Armor extends Tool{}