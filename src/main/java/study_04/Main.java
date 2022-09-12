package study_04;

public class Main {
    public static void main(String[] args) {
        // 다형의 자료를 핸들링한다.
        MultiTypeContainer.putValue(String.class, "Hello");
        MultiTypeContainer.putValue(Integer.class, 1234);
        MultiTypeContainer.putValue(Double.class, 1.234d);

        System.out.println(MultiTypeContainer.getValue(String.class));
        System.out.println(MultiTypeContainer.getValue(Integer.class));
        System.out.println(MultiTypeContainer.getValue(Double.class));
    }
}
