package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @CreateTime: 2023-05-20  03:09
 * @Description:
 * @Version: 1.0
 */
public class Student extends Object implements Comparable<Student>{
    String name;
    int node;
    public Student(String name,int score){
        this.name = name;
        this.node = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", node=" + node +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    @Override
    public int compareTo(Student o) {
        return this.node - o.node;
    }
}
