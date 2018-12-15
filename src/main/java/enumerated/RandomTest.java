package enumerated;

import lombok.extern.slf4j.Slf4j;
import net.mindview.util.Enums;

enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING
}

@Slf4j
public class RandomTest {
    public static void main(String[] args) {
//        for (Activity x : Activity.class.getEnumConstants())
//            log.info("{}", x);

        for (int i = 0; i < 20; i++)
            System.out.print(Enums.random(Activity.class) + " ");
    }
} /* Output:
STANDING FLYING RUNNING STANDING RUNNING STANDING LYING DODGING SITTING RUNNING HOPPING HOPPING HOPPING RUNNING STANDING LYING FALLING RUNNING FLYING LYING
*///:~
