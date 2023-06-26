package pan.java.datastructure.study.stack.gstack;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack.gstack
 * @Author: panYongSen
 * @CreateTime: 2023-06-16  8:26
 * @Description:����ջ
 * @Version: 1.0
 */
public class ArrayStack {
    private int[] values;
    private int maxSize;
    private int top = -1;
    public ArrayStack(int size){
        this.maxSize = size;
        this.values = new int[this.maxSize];
    }
    
    /**
     * ����ջ�Ĵ�С
     */
    public int size() {
        return this.top + 1;
    }
    
    /**
     * �ж�ջ�Ƿ���
     */
    public boolean isFull(){
        return this.top == this.maxSize -1;
    }
    
    /**
     * ����ջ��Ԫ�أ���ɾ��
     */
    public int peek(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("ջ�ǿյģ��鿴��ƨ��");
        }
        int value = this.values[this.top];
        return value;
    }
    
    /**
     * ����ջ��Ԫ�أ�����ɾ��
     */
    public int pop(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("ջ�ǿյģ��鿴��ƨ��");
        }
        int value = this.values[this.top];
        this.top--;
        return value;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * ��ջ����Ԫ��
     */
    public void push(int value){
        if(this.isFull()){
            throw new ArrayIndexOutOfBoundsException("ջ�Ѿ����ˣ���ѹ������");
        }
        top++;
        this.values[top] = value;
    }

    @Override
    public String toString(){
        String stackStr = "";
        while (this.size() > 0) {
            stackStr += this.pop() + " ";
        }
        return stackStr;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.toString());

    }
}
