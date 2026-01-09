package miscellaneous;

import java.util.HashMap;

public class CopyMain {
    public static void main(String[] args) {
        HashMap<String, String> meta = new HashMap<>();
        meta.put("1", "123");
        meta.put("2", "678");
        ShallowCopy sc1 = new ShallowCopy(1, meta);
        System.out.println(sc1.getMap());
        DeepCopy dc1 = new DeepCopy(1, meta);
        System.out.println(dc1.getMap());
        meta.put("4", "987");
        System.out.println(sc1.getMap());
        System.out.println(dc1.getMap());
    }
}
