package pan.java.datastructure.study.queue.objectqueue;

import pan.java.datastructure.study.LinkedList.SortedLink;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  13:29
 * @Description:˳�����
 * @Version: 1.0
 */
public final class OrderQueue<T extends Comparable<? super T>> {
    private SortedLink<T> list;
    private boolean asc;
    public OrderQueue(boolean asc) {
        this.asc = asc;
        this.list = new SortedLink<T>();
    }

    public OrderQueue(){
        this(true);
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public boolean add(T value){
        return this.list.insert(value) != null;
    }

    public T peek(){
        //ȥ������ĵ�һ��Ԫ��
        return this.asc ? this.list.get(0):this.list.get(this.list.size() - 1);
    }

    public T poll(){
        //ȥ����������uһ��Ԫ��
        return this.asc ? this.list.remove(0):this.list.remove(this.list.size() - 1);
    }

    @Override
    public String toString(){
//        ���ݴ���Ķ���˳�������Ӧ�Ĵ�
        return this.getClass().getName()+" "+(this.asc?this.list.toString():this.list.toPreviousString());
    }

}
