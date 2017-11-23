import java.util.Arrays;

public class zalozone {
    public static String[][] wear = new String[1][1];

    public static void equipWeapon(int itemID, int index1, int index2) {
        wear[0][0] = Tool1.equipment[index1][index2];
    }

    public static void equipArrmor(int itemID, int index1, int index2) {
        wear[0][1] = Tool1.equipment[index1][index2];
    }


    public static void showWear() { // metoda ktora pokazuje zalozone itemy

        System.out.println("--------------------------------");
        System.out.println("Przedmioty które masz na sobie:");
         System.out.println("Bron: "+ wear[0][0]);
            System.out.println("--------------------------------");
        }
    public static void showEq() { // metoda ktora pokazuje wszystkie nasze przedmioty

        System.out.println("--------------------------------");
        System.out.println("Przedmioty ktore posiadasz w ekwipunku: ");
        for(int i=0; i< Tool1.equipment.length; i++)
            for(int j=0; j< Tool1.equipment[i].length; j++) // petla leci przec cala tablice i wypisuje indeksy ktore nie sa puste
                if(Tool1.equipment[i][j]!= null){
                    System.out.println(Tool1.equipment[i][j]);
        }
        System.out.println();
        System.out.println("--------------------------------");
    }
    }
