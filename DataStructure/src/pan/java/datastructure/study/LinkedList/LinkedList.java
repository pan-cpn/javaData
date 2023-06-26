package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-21  03:23
 * @Description:
 * @Version: 1.0
 */
public class LinkedList <T>{
//    链表头结点不保存数据
    public Node<T> head;
    public LinkedList(){
        this.head = new Node<T>();  //初始化头结点
    }
    /**
     * 传入一个数组，初始化链表
     */
    public LinkedList(T[] values){
        this();
        Node<T> rear = this.head;
        for(int i = 0;i < values.length; i++){
            rear.next = new Node<T>(values[i],null);
            rear = rear.next;
        }
    }

    public LinkedList(LinkedList<T> list) {
        Node<T> tNode = this.head;
        for(int i = 0;i < list.size(); i++){
            T t = list.get(i);
            tNode = new Node<T>(t,null);
            tNode = tNode.next;
        }

    }

    public boolean isEmpty(){
        return this.head.next == null;
    }

    /**
     * 获取指定下标的数组项
     */
    public T get(int index){
        Node<T> tNode = this.head.next;
        for (int i = 0;tNode!=null&&i < index;i++) {
            tNode = tNode.next;
        }
        return (index >= 0 && tNode != null)?tNode.data:null;
    }

    public void set(int index,T value){
        if(index < 0 || index >= this.size()) {
            return;
        }
        Node<T> tNode = this.head;
        for(int i = 0; i < index && tNode.next != null; i++){
            tNode = tNode.next;
        }
        System.out.println(tNode.toString());
        tNode.next.data = value;
    }

    public int size(){
        Node<T> tNode = this.head;
        int count = 0;
        while(tNode.next != null){
            tNode = tNode.next;
            count++;
        }
        return count;
    }

    @Override
    public String toString(){
        String values = "";
        for(Node<T> head = this.head;head.next != null; head = head.next){
            values += head.next.data.toString();
        }
        return values;
    }

    public Node<T> insert(int index,T value){
        if(value == null){
            throw new NullPointerException("value == null");
        }
        Node<T> tNode = this.head;
        for(int i = 0;tNode.next != null && i < index; i++){
            tNode = tNode.next;
        }
        Node<T> tNode1 = new Node<>(value, null);
        tNode1.next = tNode.next;
        tNode.next = tNode1;
        return tNode1;
    }

    public Node<T> insert(T value){
        return this.insert(Integer.MAX_VALUE,value);
    }

    public T remove(int index){
        Node<T> head = this.head;
        for(int i = 0;i < index && head.next != null; i++){
            head = head.next;
        }
        if(index >= 0 && head.next != null){
            T data = head.next.data;
            head.next = head.next.next;
            return data;
        }
        return null;
    }

    public void clear(){
        this.head.next = null;
    }

    public Node<T> search(T key){
        if(key == null){
            throw new NullPointerException("key == null");
        }
        Node<T> node = this.head;
        Node<T> targetNode = null;
        while(node.next != null){
            node = node.next;
            if(node.data == key){
                targetNode = node;
                return targetNode;
            }
        }
        return null;
    }

    public boolean contains(T key){
        return this.search(key) != null;
    }

    public Node<T> insertDifferent(T value){
        if(this.search(value) != null){
            return null;
        }else {
            return this.insert(value);
        }
    }

    public T remove(T value){
        if(value == null || this.search(value) == null){
            return null;
        }else{
            Node<T> tNode = this.head;
            T data = null;
            while(tNode.next != null && tNode.next.data != value){
                tNode = tNode.next;
            }
            data = tNode.next.data;
            tNode.next = tNode.next.next;
            return data;
        }
    }
}
