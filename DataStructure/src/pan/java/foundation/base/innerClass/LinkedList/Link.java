package pan.java.foundation.base.innerClass.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  10:25
 * @Description:
 * @Version: 1.0
 */
public interface Link <T> {
    public void add(T t);

    public int size();

    public boolean isEmpty();

    public Object[] toArray();

    public T get(int index);

    public boolean contains(T t);

    public void remove(T t);

    public void clean();

    public void set(int index, T t);
}
