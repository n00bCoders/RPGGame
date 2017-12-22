package Items;

public class Bag {

    static int[][] bag = new int[4][3];
    static int[][] special = new int[2][6];
    static int[] onMe = new int[3];

    public static void onMe(){
        onMe[0] = bag[0][1];
        onMe[1] = 0;
        onMe[2] = 0;
        onMe[3] = 0;
    }

    public static void bag(){

        System.out.println("Pokaz, kotku, co masz w srodku");
        for(int i = 0; i < bag.length; i++){
            for(int j = 0; j< bag[i].length; j++){
                if(bag[i][j]!= 0){
                    System.out.println(bag[i][j]);
                }
            }
        }
    }

    public static void addWeapon(int id){
        for (int i = 0; i < bag.length; i++){
            if (bag[0][i] == 0){
                bag[0][i] = id;
                break;
            }
            else{
                System.out.println("Nie masz wiecej miejsca");
            }
        }

    }
}
