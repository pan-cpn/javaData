package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-21  03:22
 * @Description:
 * @Version: 1.0
 */
public class Node<T>{
    public T data;
    public Node<T> next;
    public Node(T data,Node<T> next){
        this.data  = data;
        this.next = next;
    }
    public Node(){
        this(null,null);
    }

    public String String(){
        return this.data.toString();
    }
}
