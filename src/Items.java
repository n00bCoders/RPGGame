public class Items {

    public static String[][] equipment = new String[50][50];

    public static void add(String itemID, int index1, int index2){
        equipment[index1][index2] = itemID;
    }
}
