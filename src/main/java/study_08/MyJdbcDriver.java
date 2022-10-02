package study_08;

public class MyJdbcDriver {
    static {
        connect();
    }

    public static void connect() {
        System.out.println("connect to JDBC");
    }

    public void select() {
        System.out.println("select");
    }
}
