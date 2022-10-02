package study_08;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 리플랙션을 통한 객체 생성 예외 포인트가 많아, 실행타임 중 예외가 발생할 가능성이 농후하다
        String className = MyJdbcDriver.class.getName();
        String wrongClassName = "fail.Driver";

        // 1) ClassNameNotFound
        Class cls = Class.forName(className);
        // 2) 생성자가 없는 경우
        Constructor constructor = cls.getConstructor();

        MyJdbcDriver jdbcDriver = (MyJdbcDriver) constructor.newInstance();
        jdbcDriver.select();
    }

}
