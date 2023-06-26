package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @CreateTime: 2023-05-20   13:12
 * @Description:
 * @Version: 1.0
 */
public class SortedSeqList <T extends Comparable<? super T>> extends SeqList<T>{
    public SortedSeqList() {
        super();
    }
    public SortedSeqList(int length){
        super(length);
    }
    public SortedSeqList(T[] values){
        super(values);
        for(int i = 0;i < values.length;i++){
            this.insert(values[i]);
        }
    }

    @Override
    public int insert(T value){
        int i = 0;
        if(this.isEmpty() || value.compareTo(this.get(this.size() - 1)) > 0){
            i = this.n;
        }else{
            while(i < this.n && value.compareTo(this.get(i)) > 0){
                i++;
            }
        }
        super.insert(i,value);
        return i;
    }

    @Override
    public int search(T key){
        for(int i = 0;i < this.n && key.compareTo(this.get(i))>=0;i++){
            if(key.compareTo(this.get(i)) == 0){
                return i;
            }
        }
        return -1;
    }
}
