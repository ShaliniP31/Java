package miscellaneous;

import java.util.HashMap;

public final class ImmutableStudent {
    private final int id;
    private final String name;
    private final HashMap<String, String> metadata;

    public ImmutableStudent(int id, String name, HashMap<String, String> metadata) {
        this.id = id;
        this.name = name;

        this.metadata = new HashMap<>(metadata);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }
}
