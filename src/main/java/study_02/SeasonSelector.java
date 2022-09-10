package study_02;

import javax.swing.*;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SeasonSelector {

    private static NavigableMap<Integer, Season> seasonNavigableMap = new TreeMap<>();
    static {
        seasonNavigableMap.put(100, Season.SPRING);
        seasonNavigableMap.put(75, Season.SUMMER);
        seasonNavigableMap.put(50, Season.FALL);
        seasonNavigableMap.put(25, Season.WINTER);
    }

    public static Season select(int val) {
        return seasonNavigableMap.ceilingEntry(val).getValue();
    }

    enum Season {
       SPRING("봄"),
       SUMMER("여름"),
       FALL("가을"),
       WINTER("겨울");

       private final String text;

       Season(String text) {
           this.text = text;
       }

       public String getText() {
           return text;
       }

        @Override
        public String toString() {
            return "Season{" +
                    "text='" + text + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
       Season season = SeasonSelector.select(50);
        System.out.println(season);
    }
}
