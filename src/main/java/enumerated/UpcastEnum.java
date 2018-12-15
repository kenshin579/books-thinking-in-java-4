package enumerated;
// No values() method if you upcast an enum

import lombok.extern.slf4j.Slf4j;

enum Search {HITHER, YON}

@Slf4j
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        for (Search x : vals)
            log.info("{}", x);

        Enum e = Search.HITHER; // Upcast
        // e.values(); // No values() in Enum
        for (Enum en : e.getClass().getEnumConstants())
            System.out.println(en);
    }
} /* Output:
HITHER
YON
*///:~
