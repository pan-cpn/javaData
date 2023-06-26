package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-21  03:23
 * @Description:
 * @Version: 1.0
 */
public interface Linked<T> {
    boolean isEmpty();
    int size();
    T get(int i);
    void set(int index,T value);
    void remove();
    void clear();
    boolean equals();
    void addAll();
}
