package pan.java.foundation.reflect.autoSetvalues;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect.autoSetvalues
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  15:57
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        String value = "name:pan|sex:male";
        Person p = ClassInstanceFactory.create(Person.class, value);
        System.out.println(p.getName());
    }
}
