package ac.za.cput.project.util;

import java.util.UUID;

public class Misc {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
