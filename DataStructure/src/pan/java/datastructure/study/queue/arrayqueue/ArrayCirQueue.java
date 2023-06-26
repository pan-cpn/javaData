package pan.java.datastructure.study.queue.arrayqueue;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue.arrayqueue
 * @Author: panYongSen
 * @CreateTime: 2023-06-14  11:18
 * @Description:数组实现唤醒队列
 * @Version: 1.0
 */
public class ArrayCirQueue {
    //队列满的条件：(rear + 1)%maxSize = front
    //队列空的条件：rear == front
    private int front; //0
    private int rear;//7
    private int maxSize;  //8
    private int[] cirQueue;
    public ArrayCirQueue(int maxSize) {
        this.front = 0;
        this.rear = 0;;
        this.maxSize = maxSize;
        this.cirQueue = new int[maxSize];

    }

    public boolean isEmpty(){
        return this.rear == this.front;
    }

    public boolean isFull(){
        return (this.rear + 1) % this.maxSize == this.front;
    }

    public void addEle(int number){
        if(this.isFull()){
            throw new ArrayIndexOutOfBoundsException("队列已经满了，不能在添加！！");
        }
        cirQueue[rear] = number;
        this.rear = (this.rear + 1) % this.maxSize;
    }
    public static void main(String[] args) {

    }
}
