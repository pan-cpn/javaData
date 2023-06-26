package pan.java.datastructure.study.queue.objectqueue;

import pan.java.datastructure.study.LinkedList.Node;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  08:36
 * @Description:链表实现队列结构
 * @Version: 1.0
 */
public class LinkedQueue<T> {
    public Node<T> front,rear;
    public LinkedQueue() {
        //初始化队列,空队列
        this.front = this.rear = null;
    }

    public boolean isEmpty(){
//        队列空时,第一个和最后一个队列元素都是null;
        return this.front == null &&this.rear == null;
    }

    public boolean add(T x){
        if(x == null){
            return false;
        }
        Node<T> node = new Node<T>(x,null);
        if(this.front == null){
            this.front = node;
        }else{
            this.rear.next = node;
        }
        this.rear = node;
        return true;
    }

    //返回队列头部元素数据
    public T peek(){
        return this.isEmpty() ? null : this.front.data;
    }

    //返回并且删除队列头部元素
    public T poll(){
        if(isEmpty()){
            return null;
        }
        T data = this.front.data;
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }
        return data;
    }
}
