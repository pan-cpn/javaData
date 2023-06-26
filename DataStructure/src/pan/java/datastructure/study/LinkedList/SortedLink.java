package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-21  04:16
 * @Description:≈≈–Úµ•¡¥±Ì
 * @Version: 1.0
 */
public class SortedLink <T extends Comparable<? super T>> extends LinkedList<T>{
    public SortedLink() {
        super();
    }

    public SortedLink(T[] values){
        super();
        for(int i = 0; i < values.length; i++){
            this.insert(values[i]);
        }
    }
    public SortedLink(SortedLink<T> list){
        super(list);
    }
    public SortedLink(LinkedList<T> list){
        super();
        for(Node<T> p = list.head.next;p!=null;p = p.next){
            this.insert(p.data);
        }
    }

//    @Override
//    public void set(int index, T value){}
//
//    @Override
//    public Node<T> insert(int index, T value){}

    @Override
    public Node<T> insert(T value){
        Node<T> head = this.head,p = head.next;
        while(p != null && value.compareTo(p.data) > 0){
            head = head.next;
            p = p.next;
        }
        head.next = new Node<T>(value,p);
        return head;
    }

    public T toPreviousString() {
        return null;
    }

//    @Override
//    public Node<T> search(T key){}
//
//    @Override
//    public Node<T> insertDifferent(T value){}
//
//    @Override
//    public T remove(T key){}
//
//    public void addAll(SortedLink<T> list){}

}
