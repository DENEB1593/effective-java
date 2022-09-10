package study_01;

import java.util.HashMap;
import java.util.Map;

public enum Calculator {
    // Enum constructor is called as many times as many constants the enum has.
    // For enums which have at least one constant, it is impossible to write static block which will be called before constructor.
    // In this case you can init static fields in static block.
    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Calculator(String symbol) {
        this.symbol = symbol;
    }

    abstract double apply(double x, double y);

    @Override
    public String toString() {
        return symbol;
    }

    private static final Map<String, Calculator> stringToEnum = new HashMap<>();
    static {
        for (Calculator value : Calculator.values()) {
            stringToEnum.put(value.toString(), value);
        }
    }

    public static Calculator fromString(String symbol) {
        return stringToEnum.get(symbol);
    }
}
