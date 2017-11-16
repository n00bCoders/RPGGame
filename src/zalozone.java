import java.util.Arrays;

public class zalozone {
    public static String[][] wear = new String[1][1];

    public static void equipWeapon(int itemID, int index1, int index2) {
        wear[0][0] = Tool1.equipment[index1][index2];
    }
    public static void equipArrmor(int itemID, int index1, int index2) {
        wear[0][1] = Tool1.equipment[index1][index2];
    }

    public static void showWear() {

        System.out.println("--------------------------------");
        System.out.println("Przedmioty które masz na sobie:");
         System.out.println("Bron: "+ wear[0][0]);
            System.out.println("--------------------------------");
        }
    public static void showEq() {

        System.out.println("--------------------------------");
        System.out.println("Przedmioty ktore posiadasz w ekwipunku: ");
        for(int i=0; i< Tool1.equipment.length; i++)
            for(int j=0; j< Tool1.equipment[i].length; j++)
                if(Tool1.equipment[i][j]!= "chuj"){
                    System.out.println(Tool1.equipment[i][j]);
        }
        System.out.println();
        System.out.println("--------------------------------");
    }
    }
