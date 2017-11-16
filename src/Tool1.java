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

// [0] - [10] klucze
// [1-2] - [10] itemy zwiazane z przemieszczaniem po mapie
// [3] - [10] potki
// [4-5] - [10] miecze
// [6-7] - [10] zbroja


// [0][0] klucz do skrzyni
// [0][1] klucz do drzwi


// [1][0] pochodnia
// [1][1] tajemniczy amulet

//class Key extends Tool{}
//class Weapon extends Tool{}
//class Armor extends Tool{}