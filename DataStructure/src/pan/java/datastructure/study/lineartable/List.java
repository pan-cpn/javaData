package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @Description:���Ա���ȡ���ݵĽ��������������ɾ�Ĳ飬���Ա�ֵÿ����Ԫֻ��һ��ǰ�ýڵ��һ�����ýڵ�
 * @Version: 1.0
 */
public interface List <T>{
    /**
     * һ�����ݽṹ�Ļ��������б�
     */
    boolean isEmpty();
    int size();
    T get(int i);
    void set(int i,T x);
    @Override
    String toString();
    int insert(int i,T x);
    T remove();
    void clear();
    int search();
    boolean contains(T key);
    int insertdifferent();
    T remove(T key);
    @Override
    boolean equals(Object obj);
    void addAll(List<T> list);
}
