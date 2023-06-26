package pan.java.foundation.base.innerClass.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  13:27
 * @Description:
 * @Version: 1.0
 */
public class LinkImpl<T> implements Link<T> {
    private Node<T> root;
    private int count;
    private int foot;
    private Object[] dataArray;
    //    内部类实现
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
        public void addNode(Node<T> node){
            if(this.next == null){
                this.next = node;
            }else{
                this.next.addNode(node);
            }
        }
        public void toArrayNode(){
            LinkImpl.this.dataArray[LinkImpl.this.foot++] = this.data;
            if(this.next != null){
                this.next.toArrayNode();
            }
        }
        public T getData(int index){
            if(LinkImpl.this.foot++ == index){
                return this.data;
            }else {
                return this.next.getData(index);
            }
        }
        public void setData(int index,T data){
            if(LinkImpl.this.foot++ == index){
                this.data = data;
            }else{
                this.next.setData(index,data);
            }
        }
        public void removeNode(Node prevoius,T data){
            if(this.data.equals(data)){
                prevoius.next = this.next;
            }else{
                if(this.next != null){
                    this.next.removeNode(this,data);
                }
            }
        }
        public boolean containsNode(T data){
            if(this.data.equals(data)){
                return true;
            }else{
                if(this.next == null){
                    return false;
                }else{
                    return this.next.containsNode(data);
                }
            }
        }
    }
    @Override
    public void add(T t) {
        if(t == null){
            return;
        }
        Node<T> node = new Node<T>(t);
        if(this.root == null){
            this.root = node;
        }else{
            this.root.addNode(node);
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Object[] toArray() {
        if(this.isEmpty()){
            return null;
        }
        this.foot = 0;
        this.dataArray = new Object[this.count];
        this.root.toArrayNode();
        return this.dataArray;
    }

    @Override
    public T get(int index) {
        if(index >= this.count){
            throw new ArrayIndexOutOfBoundsException("index is bigger than this count");
        }
        this.foot = 0;
        return this.root.getData(index);
    }

    @Override
    public boolean contains(T t) {
        if(t == null) {
            return false;
        }
        return this.root.containsNode(t);
    }

    @Override
    public void remove(T t) {
        if(this.contains(t)){
            if(this.root.data.equals(t)){
                this.root = this.root.next;
            }else{
                this.root.next.removeNode(this.root,t);
            }
            this.count--;
        }
    }

    @Override
    public void clean() {
        this.root = null;
        this.count = 0;
    }

    @Override
    public void set(int index, T t) {
        if(index >= this.count){
            throw new ArrayIndexOutOfBoundsException("index error");
        }
        this.foot = 0;
        this.root.setData(index,t);
    }


}
