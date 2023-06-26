package pan.java.foundation.reflect.autoSetvalues;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect.autoSetvalues
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  12:53
 * @Description:
 * @Version: 1.0
 */
public class Person {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }
}
