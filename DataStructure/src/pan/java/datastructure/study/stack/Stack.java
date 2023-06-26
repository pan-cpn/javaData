package pan.java.datastructure.study.stack;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  13:43
 * @Description:栈结构
 * @Version: 1.0
 */
public interface Stack<T> {
//    栈结构遵循的是先进后出的插入和删除顺序，不能冲中间插入或者删除元素
    public abstract boolean isEmpty();
    public abstract void push(T x);
    public abstract T peek();
    public abstract T pop();
}
