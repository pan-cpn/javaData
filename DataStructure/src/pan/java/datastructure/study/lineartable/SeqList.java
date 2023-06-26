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
     * �����������洢���˱��Ԫ��
     */
    protected Object[] element;
    /**
     * ���ڼ�¼���Ա�ĸ���
     */
    protected int n;
    public SeqList(int length){
        /**
         * ��ʼ�����Ա�ԵĴ�С
         */
        this.element = new Object[length];
        this.n = 0;
    }
    public SeqList(){
        //���ô��ι�צ������ʼ�������С
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
     * �������鴴������
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
     * �����±��ȡԪ��
     */
    public T get(int i){
        if(i >= 0 && i < this.n){
            return (T)this.element[i];
        }
        return null;
    }

    /**
     * �޸�ָ���±��Ԫ��
     */
    public void set(int i, T x){
        if(x == null){
            throw new NullPointerException("x == null");
        }
        if(i >= 0 && i < this.n){
            this.element[i] = x;
        }else {
            throw new IndexOutOfBoundsException(i + "Խ����");
        }
    }

    /**
     * ����Ԫ��
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
//        ���Ƶ����Ա������
        Object[] source = this.element;
        if(this.n == element.length){
            this.element = new Object[source.length * 2];
            //��i�±�ǰ���Ԫ�ظ�ֵ���µ�����������
            for(int j = 0;j < i;j++){
                this.element[j] = source[j];
            }
        }
        //            ��i�±�֮���Ԫ��������һλ,�ڳ�λ�÷���Ԫ��
        for(int j = this.n - 1;j >= i;j--){
            this.element[j + 1] = source[j];
        }
        this.element[i] = x;
        this.n++;
        return i;
    }

    /**
     * �����Ա�ĺ������
     */
    public int insert(T x){
        return this.insert(this.n,x);
    }

    /**
     * �Ƴ�ָ���±��Ԫ��
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
