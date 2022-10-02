package study_06;

import com.google.common.collect.Collections2;
import org.apache.commons.collections4.CollectionUtils;
import org.checkerframework.checker.units.qual.C;

import java.util.*;

/*
콜렉션의 NULL일 경우 빈값을 반환
* */
public class Main {
    private static List<Cheese> cheeses = new ArrayList<>();
    static {
        cheeses.add(new Cheese());
        cheeses.add(new Cheese());
        cheeses.add(new Cheese());
        cheeses.add(new Cheese());
    }

    private static List<Cheese> getCheeses() {
        // 기본 Collection의 isEmpty() 사용 시 null 확인은 안하므로 별도 라이브러리 사용
        return CollectionUtils.isEmpty(cheeses) ?
                Collections.emptyList() : cheeses;
    }

    public static void main(String[] args) {
        System.out.println(getCheeses());
    }
}
