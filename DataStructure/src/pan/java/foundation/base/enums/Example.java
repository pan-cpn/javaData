package pan.java.foundation.base.enums;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.enums
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  06:48
 * @Description:
 * @Version: 1.0
 */
public class Example {
    public static void main(String[] args) {
        new Person("kandy",21,Sex.MALE);
    }
}
enum Sex{
    MALE("ÄÐÐÔ"),FEMALE("Å®ÐÔ");
    private String sex;
    private Sex(String sex){
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.sex;
    }
}

class Person{
    private String name;
    private int age;
    private Sex sex;

    public Person(String kandy, int age, Sex sex) {
        this.name = kandy;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name = " + this.name + ",age = " + this.age + ", sex = " + this.sex.toString();
    }
}