package study_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    객체화된 자료형 대신 기본 자료형을 이용하라
    기본 자료형을 객체로 사용 시 주의할 것
 */
public class Main {

    Comparator<Integer> naturalOrder = (first, second) -> {
/*
       return first < second ? -1 :
               // 정수자료형 객체에서는 == (동일성)에 대한 의미가 달라진다. 따라서 오류가 발생할 수 있는 지점이다.
               (first == second) ? 0 : 1;
*/
        int f = first;      //auto-unboxing
        int s = second;

        // auto-unboxing(기본형 변환)으로 동일성 연산에 대한 오류 해결
/*
        return f < s ? -1 : (f == s) ? 0 : 1;
*/

        // 아니면 compareTo를 통해 더 깔끔하게 해결 할 수 있음.(내부적으로 autounboxing을 진행)
        return first.compareTo(second);
    };

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Duration : " + (end - start));  // 708ms

        start = System.currentTimeMillis();
        Long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Duration : " + (end - start)); // 3419ms
        // auto-unboxing에 따른 성능 차이 발생

        // 그렇다면 객체화된 기본자료형은 언제사용?
        // 형인자는 객체타입만 사용할 수 있다.
        List<Integer> list = new ArrayList<>();
    }
}
