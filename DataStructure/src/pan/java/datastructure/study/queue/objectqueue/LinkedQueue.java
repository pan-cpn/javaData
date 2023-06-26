package pan.java.datastructure.study.queue.objectqueue;

import pan.java.datastructure.study.LinkedList.Node;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  08:36
 * @Description:����ʵ�ֶ��нṹ
 * @Version: 1.0
 */
public class LinkedQueue<T> {
    public Node<T> front,rear;
    public LinkedQueue() {
        //��ʼ������,�ն���
        this.front = this.rear = null;
    }

    public boolean isEmpty(){
//        ���п�ʱ,��һ�������һ������Ԫ�ض���null;
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

    //���ض���ͷ��Ԫ������
    public T peek(){
        return this.isEmpty() ? null : this.front.data;
    }

    //���ز���ɾ������ͷ��Ԫ��
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
