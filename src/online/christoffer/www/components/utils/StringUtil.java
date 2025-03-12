package online.christoffer.www.components.utils;

public class StringUtil {

    public static String coalesce(String s, String defaultValue) {
        return s == null ? defaultValue : s;
    }

}
