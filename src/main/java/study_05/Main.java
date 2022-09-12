package study_05;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // EnumMap을 사용하여 Enum 데이터를 가져오자
        Map<Herb.Type, Set<Herb>> herbMap = new EnumMap<>(Herb.Type.class);
        herbMap.put(Herb.Type.ANNUAL, new HashSet<>());
        herbMap.put(Herb.Type.BIENNIAL, new HashSet<>());
        herbMap.put(Herb.Type.PERENNIAL, new HashSet<>());
        System.out.println(herbMap);


        System.out.println(Phase.Transition.getPHASE_MAP());
    }
}
