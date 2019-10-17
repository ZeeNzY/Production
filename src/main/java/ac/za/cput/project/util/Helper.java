package ac.za.cput.project.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String upperCase = "";
        for(int i = 0; i < className.length(); i++)
        {
            char charA  = className.charAt(i);
            if(Character.isUpperCase(charA))
            {
                upperCase += charA;
            }
        }
        return upperCase;
    }
}
