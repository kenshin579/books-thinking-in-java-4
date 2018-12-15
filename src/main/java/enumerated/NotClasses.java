package enumerated;
// {Exec: javap -c LikeClasses}

import net.mindview.util.OSExecute;

import static net.mindview.util.Print.print;

enum LikeClasses {
    WINKEN {
        void behavior() {
            print("Behavior1");
        }
    },
    BLINKEN {
        void behavior() {
            print("Behavior2");
        }
    },
    NOD {
        void behavior() {
            print("Behavior3");
        }
    };

    abstract void behavior();
}

public class NotClasses {
    //     void f1(LikeClasses.WINKEN instance) {} // Nope

    public static void main(String[] args) {
        String className = LikeClasses.class.getProtectionDomain().getCodeSource().getLocation().getFile() + LikeClasses.class.getName().replace(".", "/") + ".class";
        OSExecute.command("javap " + className);
    }
} /* Output:
Compiled from "NotClasses.java"
abstract class LikeClasses extends java.lang.Enum{
public static final LikeClasses WINKEN;

public static final LikeClasses BLINKEN;

public static final LikeClasses NOD;
...
*///:~
