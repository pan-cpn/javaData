package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-23  09:07
 * @Description:
 * @Version: 1.0
 */
public class DoubleNode <T>{
    public T data;
    public DoubleNode<T> pre,next;
    public DoubleNode(T data,DoubleNode<T> pre,DoubleNode<T> next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }
    public DoubleNode(T data) {
        this(data,null,null);
    }

    public DoubleNode(){}

    @Override
    public String toString(){
        return this.data.toString();
    }
}
