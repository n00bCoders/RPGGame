package Items;

public class Eq {

    static Weapons ArrayEQ[] = new Weapons[100];

    void setArrayEQ() {
        ArrayEQ[1] = WeaponsList.Weapon1;
    }



    int getArrayEQ(int i) {

        i = i;
        System.out.println(ArrayEQ[i].requireStrength);

        return ArrayEQ[i].requireStrength;
    }


}
