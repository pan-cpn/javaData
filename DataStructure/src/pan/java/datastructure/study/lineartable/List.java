package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @Description:线性表，读取数据的建议操作，包含增删改查，线性表值每个单元只有一个前置节点和一个后置节点
 * @Version: 1.0
 */
public interface List <T>{
    /**
     * 一般数据结构的基本操作列表
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
