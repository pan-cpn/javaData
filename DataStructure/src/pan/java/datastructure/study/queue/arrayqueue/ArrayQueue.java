package pan.java.datastructure.study.queue.arrayqueue;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue.arrayqueue
 * @Author: panYongSen
 * @CreateTime: 2023-06-14  8:45
 * @Description:数组实现队列
 * @Version: 1.0
 */
public class ArrayQueue {
    //数组的最大容量
    private int maxSize;
    //队列头部
    private int front;
    //队列尾部
    private int rear;
    //队列存储数组
    private int[] queue;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    /**
     * 判断队列是否满了
     */
    public boolean isFull(){
        return this.rear == maxSize -1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty(){
        return this.rear == this.front;
    }

    /**
     * 添加元素到队列
     */
    public void add(int number){
        if(this.isFull()){
            throw new ArrayIndexOutOfBoundsException("队列满了不能在添加");
        }
        queue[++this.rear] = number;
    }

    /**
     * 取得并返回队列头部元素
     */
    public int pull(){
        if(this.isEmpty()){
            throw new NullPointerException("队列空的，没有数据可以取！");
        }
        return this.queue[++this.front];
    }

    /**
     * 移除队列头部元素
     */
    public void removeFront(){
        if(this.isEmpty()){
            throw new NullPointerException("队列时空的没有数据可以删除！");
        }
        this.front++;
        this.queue[front] = 0;
    }


    /**
     * 输出队列元素
     */
    public void toStr() {
        for(int i = this.front; i < this.rear;i++) {
            System.out.print(this.queue[i] + " ");
        }
    }

}
