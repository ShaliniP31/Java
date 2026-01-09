package miscellaneous;

import java.util.HashMap;

public class ImmutableMain {
    public static void main(String[] args) {
        HashMap<String, String> meta = new HashMap<>();
        meta.put("1", "123");
        meta.put("2", "678");
        int id = 1;
        ImmutableStudent s = new ImmutableStudent(id, "Jane Mendonca", meta);
        System.out.println(s.getMetadata());

        meta.put("3", "987");
        // will not change as not being set anywhere, also original temp is not being returned
        System.out.println(s.getMetadata());

        id = 4;
        System.out.println(s.getId());
    }
}
