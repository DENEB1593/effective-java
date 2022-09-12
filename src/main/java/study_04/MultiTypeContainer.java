package study_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MultiTypeContainer {

    private static Map<Class<?>, Object> map = new HashMap<>();

    public static <T> void putValue(Class<T> type, T value) {
        Objects.requireNonNull(value);
        // put 전 형변환을 하여 자료형의 안전성을 확보
        map.put(type, type.cast(value));
    }
    public static <T> T getValue(Class<T> type) {
        return type.cast(map.getOrDefault(type, null));
    }
}
