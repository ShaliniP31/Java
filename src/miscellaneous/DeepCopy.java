package miscellaneous;

import java.util.HashMap;

public class DeepCopy {
    int id;
    HashMap<String , String > map;

    public DeepCopy(int id, HashMap<String , String > map){
        this.id = id;
        this.map = new HashMap<>(map);
    }

    public int getId() {
        return id;
    }

    public HashMap<String, String> getMap() {
        return map;
    }
}
