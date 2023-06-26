package pan.java.foundation.base.innerClass.CarStore;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass.CarStore
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  11:36
 * @Description:
 * @Version: 1.0
 */
public class Cat implements Pet{
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
