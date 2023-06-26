package pan.java.datastructure.study.stack;

import pan.java.datastructure.study.LinkedList.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  15:56
 * @Description:链表实现的栈
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
        //在表头插入元素，，先进后出
        this.list.insert(0,x);
    }

    @Override
    public T peek() {
        //返回栈的头部
        return this.list.get(0);
    }

    @Override
    public T pop() {
//        删除栈的头部元素并且返回
        return this.list.remove(0);
    }
}
