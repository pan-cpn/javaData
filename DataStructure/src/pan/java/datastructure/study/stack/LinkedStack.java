package pan.java.datastructure.study.stack;

import pan.java.datastructure.study.LinkedList.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  15:56
 * @Description:����ʵ�ֵ�ջ
 * @Version: 1.0
 */
public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> list;
    public LinkedStack() {
        this.list = new LinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(T x) {
        //�ڱ�ͷ����Ԫ�أ����Ƚ����
        this.list.insert(0,x);
    }

    @Override
    public T peek() {
        //����ջ��ͷ��
        return this.list.get(0);
    }

    @Override
    public T pop() {
//        ɾ��ջ��ͷ��Ԫ�ز��ҷ���
        return this.list.remove(0);
    }
}
