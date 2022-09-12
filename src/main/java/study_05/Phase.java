package study_05;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {
    SOLID, LIQUID, GAS;

    @AllArgsConstructor
    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS),   CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase src;
        private final Phase dst;

        // the phase transition map 초기화
        @Getter
        private static final Map<Phase, Map<Phase, Transition>> PHASE_MAP = new EnumMap<>(Phase.class);
//                m = Stream.of(values())
//                .collect(groupingBy(t -> t.src,
//                    () -> new EnumMap<>(Phase.class),
//                    toMap(t -> t.dst, t -> t,
//                            (x, y) -> y, () -> new EnumMap<>(Phase.class)))
//                );

        static {
            for (Phase p : Phase.values())
                PHASE_MAP.put(p, new EnumMap<> (Phase.class) );

            for (Transition trans :Transition.values() )
                PHASE_MAP.get(trans.src).put(trans.dst, trans);
        }


        public static Transition from(Phase from, Phase to) {
            return PHASE_MAP.get(from).get(to);
        }

    }
}
