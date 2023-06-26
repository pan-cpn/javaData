package pan.java.datastructure.study.queue.objectqueue;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  12:28
 * @Description:
 * @Version: 1.0
 */
public class Queue<T>{
    /**
     * 声明存储队列数据的队列
     */
    private Object[] element;

    private int front,rear;

    public Queue(int length){
        if(length < 64){
            length = 64;
        }
        this.element = new Object[length];
        this.front = this.rear = 0;
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean add(T data) {
        if(data == null){
            return false;
        }
        if(this.front == (this.rear + 1) % this.element.length){
            Object[] temp = this.element;
            int j = 0;
            for(int i = this.front;i != this.rear;i = (i + 1) % temp.length){
                this.element[j++] = temp[i];
            }
            this.front = 0;
            this.rear = j;
        }
        this.element[this.rear] = data;
        this.rear = (this.rear + 1) % this.element.length;
        return true;
    }

    public T peek() {
        return this.isEmpty() ? null : (T)this.element[this.front];
    }


    public T poll() {
        if(this.isEmpty()){
            return null;
        }
        T temp = (T)this.element[this.front];
        this.front = (this.front + 1) % this.element.length;
        return temp;
    }
}
