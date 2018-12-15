//: net/mindview/util/Enums.java
package net.mindview.util;

import java.util.Random;

//todo: 이 부분 잘 이해가 안됨 (제네릭 스터디하기)
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
} ///:~
