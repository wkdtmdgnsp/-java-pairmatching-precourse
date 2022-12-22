package pairmatching.model;

import java.util.Arrays;

public enum Mission {
    RACING("자동차경주", "레벨1"),
    LOTTO("로또", "레벨1"),
    BASEBALL("숫자야구게임", "레벨1"),
    BASKET("장바구니", "레벨2"),
    PAYMENT("결제", "레벨2"),
    SUBWAY("지하철노선도", "레벨2"),
    PERFORMANCE("성능개선", "레벨4"),
    DISTRIBUTE("배포", "레벨4");

    private String name;
    private String level;

    Mission(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public static Mission findMission(String name, String level) {
        return Arrays.stream(values())
                .filter(value -> value.name.equals(name))
                .filter(value -> value.level.equals(level))
                .findAny()
                .orElse(null);
    }
}
