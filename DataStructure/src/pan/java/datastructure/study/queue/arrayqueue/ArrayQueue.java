package pan.java.datastructure.study.queue.arrayqueue;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue.arrayqueue
 * @Author: panYongSen
 * @CreateTime: 2023-06-14  8:45
 * @Description:����ʵ�ֶ���
 * @Version: 1.0
 */
public class ArrayQueue {
    //������������
    private int maxSize;
    //����ͷ��
    private int front;
    //����β��
    private int rear;
    //���д洢����
    private int[] queue;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    /**
     * �ж϶����Ƿ�����
     */
    public boolean isFull(){
        return this.rear == maxSize -1;
    }

    /**
     * �ж϶����Ƿ�Ϊ��
     */
    public boolean isEmpty(){
        return this.rear == this.front;
    }

    /**
     * ���Ԫ�ص�����
     */
    public void add(int number){
        if(this.isFull()){
            throw new ArrayIndexOutOfBoundsException("�������˲��������");
        }
        queue[++this.rear] = number;
    }

    /**
     * ȡ�ò����ض���ͷ��Ԫ��
     */
    public int pull(){
        if(this.isEmpty()){
            throw new NullPointerException("���пյģ�û�����ݿ���ȡ��");
        }
        return this.queue[++this.front];
    }

    /**
     * �Ƴ�����ͷ��Ԫ��
     */
    public void removeFront(){
        if(this.isEmpty()){
            throw new NullPointerException("����ʱ�յ�û�����ݿ���ɾ����");
        }
        this.front++;
        this.queue[front] = 0;
    }


    /**
     * �������Ԫ��
     */
    public void toStr() {
        for(int i = this.front; i < this.rear;i++) {
            System.out.print(this.queue[i] + " ");
        }
    }

}
