package pan.java.datastructure.study.stack;

import pan.java.datastructure.study.lineartable.SeqList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-06-16  9:18
 * @Description:顺序表结构的栈
 * @Version: 1.0
 */
public class SeqStack<T> implements Stack<T>{
    public SeqList<T> list; //采用链表存储数据

    public SeqStack(int length){
        this.list = new SeqList<T>(length);
    }

    public SeqStack(){
        this(64);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(T x) {
        this.list.insert(x);
    }

    @Override
    public T peek() {
        return this.list.get(list.size() - 1);
    }

    @Override
    public T pop() {
        return this.list.remove(list.size() - 1);
    }
}
