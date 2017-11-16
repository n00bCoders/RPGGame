import java.util.ArrayList;
import java.util.List;


public class Key1 {
   /* List<java.lang.String> klucze = new ArrayList<>();

    public void add(int index, String element) {
        klucze.add(0, "klucz do skrzyni");
        klucze.add(1, "klucz do skrzyni2");
    }

    public void getkey(int index) {
        klucze.get(index);
    }*/
   public static String klucz(int index1){

       String[] keys = new String[45];
       keys[0] = "klucz do szkrzyni";
       keys[1] = "klucz do drzwi";

       return keys[index1];
   }
}

