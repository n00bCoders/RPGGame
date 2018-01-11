package Items;

public class Items {

    /*
    x = 1 bronie
    x = 2 armors
    x = 3 shields
    x = 4 jewelery
    x = 5 quest items

     */

    public String name;
    public int dimension_x;
    public int dimension_y;
    public int id;



    public Items(){

    }

    public Items(String name, int dimension_x, int dimension_y, int id){

        this.name = name;
        this.dimension_x = dimension_x;
        this.dimension_y = dimension_y;
        this.id = id;
    }


}

