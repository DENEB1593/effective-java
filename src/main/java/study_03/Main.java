package study_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final Comparator<String> STRING_COMPARATOR_WITH_FIELD = (s1, s2) -> {
        return s1.compareTo(s2);
    };

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("F");
        // 익명 객체를 사용하여도 좋지만 sort마다 객체 생성이 발생함
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        // static instance로 불필요한 객체 사용을 막고, 정렬객체의 의도를 정확히 표현할 수 있다
        Collections.sort(list, StringComparator.getComparator());
        // 혹은 필드에 static final을 선언하는 것도 좋은 방법
        Collections.sort(list, STRING_COMPARATOR_WITH_FIELD);

    }
}
