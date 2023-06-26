package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @Description:
 * @Version: 1.0
 */
public class SeqList <T> extends Object{
    /**
     * 采用数组来存储新兴表的元素
     */
    protected Object[] element;
    /**
     * 用于记录线性表的个数
     */
    protected int n;
    public SeqList(int length){
        /**
         * 初始化线性表对的大小
         */
        this.element = new Object[length];
        this.n = 0;
    }
    public SeqList(){
        //调用带参钩爪函数初始化链表大小
        this(64);
    }

    public SeqList(SeqList<? extends T> list){
        this.n = list.n;
        this.element = new Object[list.element.length];
        for(int i = 0;i < list.n;i++){
            this.element[i] = list.element[i];
        }
    }
    /**
     * 根据数组创建链表
     */
    public SeqList(T[] values){
        this(values.length);
        for(int i = 0;i < values.length;i++){
            this.element[i] = values[i];
        }
        this.n = values.length;
    }

    public boolean isEmpty(){
        return this.n == 0;
    }

    public int size(){
        return this.n;
    }
    /**
     * 根据下标获取元素
     */
    public T get(int i){
        if(i >= 0 && i < this.n){
            return (T)this.element[i];
        }
        return null;
    }

    /**
     * 修改指定下标的元素
     */
    public void set(int i, T x){
        if(x == null){
            throw new NullPointerException("x == null");
        }
        if(i >= 0 && i < this.n){
            this.element[i] = x;
        }else {
            throw new IndexOutOfBoundsException(i + "越界了");
        }
    }

    /**
     * 插入元素
     */
    public int insert(int i,T x){
        if(x == null){
            throw new NullPointerException("x == null");
        }
        if(i  > this.n){
            i = this.n;
        }
        if(i < 0){
            i = 0;
        }
//        复制当线性表的数据
        Object[] source = this.element;
        if(this.n == element.length){
            this.element = new Object[source.length * 2];
            //将i下标前面的元素赋值到新的数据数组中
            for(int j = 0;j < i;j++){
                this.element[j] = source[j];
            }
        }
        //            将i下标之后的元素往后移一位,腾出位置放入元素
        for(int j = this.n - 1;j >= i;j--){
            this.element[j + 1] = source[j];
        }
        this.element[i] = x;
        this.n++;
        return i;
    }

    /**
     * 从线性表的后面插入
     */
    public int insert(T x){
        return this.insert(this.n,x);
    }

    /**
     * 移除指定下标的元素
     */
    public T remove(int i){
        if(this.n > 0 &&i >= 0 && i < this.n){
            T old = (T)this.element[i];
            for(int j = i;j < this.n - 1;j++){
                this.element[j] = this.element[j + 1];
            }
            this.element[this.n -1] = null;
            this.n--;
            return old;
        }
        return null;
    }
    @Override
    public String toString() {
        String str = this.getClass().getName()+"(";
        if(this.n > 0){
            str = this.element[0].toString();
            for (int i = 1; i < this.n; i++) {
                str += this.element[i].toString();
            }
        }
        return str ;
    }

    public int search(T key){
        for(int i = 0;i < this.n;i++){
            if(key.equals(this.element[i])){
                return i;
            }
        }
        return -1;
    }

    public String toPrevoiusString() {
        return "";
    }

    public int insertDifference(T data){
        if(data == null){
            throw new NullPointerException("data == null");
        }
        if(this.search(data) != -1){
            return 0;
        }
        return this.insert(data);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof SeqList<?>){
            SeqList<T> obj1 = (SeqList<T>) obj;
            if(this.n == obj1.n){
                for(int i = 0;i < this.n;i++){
                    if(!this.get(i).equals(obj1.get(i))){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public T remove(T key){
        return this.remove(this.search(key));
    }

    public void addAll(SeqList<? extends T> list){
        if(list.isEmpty()) {return;}
        Object[] newArray = new Object[this.element.length + list.element.length];
        Object[] thisElement = this.element;
        Object[] element1 = list.element;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = thisElement[i];
        }
        for (int i = thisElement.length - 1 ; i < newArray.length; i++) {
            newArray[i] = element1[i];
        }
        this.element = newArray;
    }
}
