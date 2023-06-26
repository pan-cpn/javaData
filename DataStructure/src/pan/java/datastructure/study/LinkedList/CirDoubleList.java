package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-23  10:06
 * @Description:
 * @Version: 1.0
 */
public class CirDoubleList <T>{
    public DoubleNode<T> head;
    public CirDoubleList() {
        this.head = new DoubleNode<>();
        this.head.pre = this.head;
        this.head.next = this.head;
    }

    public boolean  isEmpty(){
        return this.head.next == this.head;
    }

    public DoubleNode<T> insert(int index,T x){
        if(x == null){
            throw new NullPointerException("x == null");
        }
        DoubleNode<T> doubleNode = this.head;
        for(int i = 0;i < index && doubleNode.next != this.head;i++){
            doubleNode = doubleNode.next;
        }
        DoubleNode<T> doubleNode1 = new DoubleNode<T>(x, doubleNode, doubleNode.next);
        doubleNode.next.pre = doubleNode1;
        doubleNode.next = doubleNode1;
        return doubleNode1;
    }

    public DoubleNode<T> insert(T x){
        if(x == null){
            throw new NullPointerException("x == null");
        }
        DoubleNode<T> tDoubleNode = new DoubleNode<T>(x,head.pre,head);
        head.pre.next = tDoubleNode;
        head.pre = tDoubleNode;
        return tDoubleNode;
    }

    public String toPreviousString(){
        String values = "";
        for(DoubleNode<T> headNode = this.head;headNode.pre != head;headNode = headNode.pre){
            values += headNode.data;
        }
        return values;
    }

    public T removeLast(){
        DoubleNode<T> pre = this.head.pre.pre;
        pre.next = this.head;
        this.head.pre = pre;
        return pre.data;
    }
}
