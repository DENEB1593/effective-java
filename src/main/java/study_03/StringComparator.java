package study_03;

import java.io.Serializable;
import java.util.Comparator;

public class StringComparator
        implements Comparator<String>, Serializable {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

    private final static StringComparator STRING_COMPARATOR = new StringComparator();

    public static Comparator<String> getComparator() {
        return STRING_COMPARATOR;
    }

}
