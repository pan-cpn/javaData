package pan.java.datastructure.study.stack.gstack;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack.gstack
 * @Author: panYongSen
 * @CreateTime: 2023-06-16  8:26
 * @Description:数组栈
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
     * 返回栈的大小
     */
    public int size() {
        return this.top + 1;
    }
    
    /**
     * 判断栈是否满
     */
    public boolean isFull(){
        return this.top == this.maxSize -1;
    }
    
    /**
     * 返回栈定元素，不删除
     */
    public int peek(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("栈是空的，查看课屁！");
        }
        int value = this.values[this.top];
        return value;
    }
    
    /**
     * 返回栈定元素，并且删除
     */
    public int pop(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("栈是空的，查看课屁！");
        }
        int value = this.values[this.top];
        this.top--;
        return value;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * 向栈亚茹元素
     */
    public void push(int value){
        if(this.isFull()){
            throw new ArrayIndexOutOfBoundsException("栈已经满了，还压个鸡儿");
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
