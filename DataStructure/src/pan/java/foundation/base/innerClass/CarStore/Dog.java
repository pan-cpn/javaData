package pan.java.foundation.base.innerClass.CarStore;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass.CarStore
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  11:37
 * @Description:
 * @Version: 1.0
 */
public class Dog implements Pet{
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
