package pan.java.datastructure.study.stack;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  13:43
 * @Description:ջ�ṹ
 * @Version: 1.0
 */
public interface Stack<T> {
//    ջ�ṹ��ѭ�����Ƚ�����Ĳ����ɾ��˳�򣬲��ܳ��м�������ɾ��Ԫ��
    public abstract boolean isEmpty();
    public abstract void push(T x);
    public abstract T peek();
    public abstract T pop();
}
