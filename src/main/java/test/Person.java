package test;

import lombok.Data;
import net.mindview.util.OSExecute;

@Data
public class Person {
    String name;

    public static void main(String[] args) {
        String className = Person.class.getProtectionDomain().getCodeSource().getLocation().getFile() + Person.class.getName().replace(".", "/") + ".class";
        OSExecute.command("javap " + className);
    }

}
