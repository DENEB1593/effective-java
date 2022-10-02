package study_05;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public class Herb {
    enum Type { ANNUAL,PERENNIAL, BIENNIAL }

    private final String name;
    private final Type type;
}
