public class Tool1 {
    public static String[][] equipment = new String[50][50];

    public static void add(int itemID, int index1, int index2){ equipment[index1][index2] = others.othe(itemID); }
    //dodaje itemy z klasy others do eq (tablicy)
    public static void addkeys(int itemID, int index1, int index2){ equipment[index1][index2] = Key1.klucz(itemID); }
    //dodaje itemy z klasy key1 do eq (tablicy)
    public static void addweapon(int itemID, int index1, int index2){ equipment[index1][index2] = Weapon.weapon(itemID); }
    //dodaje itemy z klasy weapon do eq (tablicy)


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


//[6][0] zardzewialy miecz
//[6][1] zardzewialy dlugi miecz

