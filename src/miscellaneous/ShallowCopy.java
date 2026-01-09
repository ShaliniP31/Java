package miscellaneous;

import java.util.HashMap;

public class ShallowCopy {

    int id;
    HashMap<String , String > map;

    public ShallowCopy(int id, HashMap<String , String > map){
        this.id = id;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public HashMap<String, String> getMap() {
        return map;
    }
}
