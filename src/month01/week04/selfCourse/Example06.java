package month01.week04.selfCourse;

import java.util.HashSet;

/**
 * Object对象的clone操作
 */
public class Example06 {

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", 7, "white");
        HashSet<Object> objects = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            try {
                objects.add(cat.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        objects.forEach(System.out::println);
    }
}
