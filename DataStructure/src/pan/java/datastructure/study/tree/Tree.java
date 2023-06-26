package pan.java.datastructure.study.tree;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.tree
 * @Author: panYongSen
 * @CreateTime: 2023-06-02  12:45
 * @Description:
 * @Version: 1.0
 */
public interface Tree<T> {
    /**
     * �ж����Ƿ�Ϊ��
     */
    boolean isEmpty();
    /**
     * ����key�ؼ������ڵĽڵ�Ĳ㼶
     */
    int level(T key);
    /**
     * �������Ľڵ���
     */
    int size();
    /**
     * �������ĸ߶�
     */
    int height();
    /**
     * ����������
     */
    void preorder();
    /**
     * ���ĺ�������
     */
    void postorder();
    /**
     * ��Ĳ�������
     */
    void levelorder();
    /**
     * �������ĸ������
     */
    BinaryNode<T> insertRoot(T x);
    /**
     * ����p�ڵ������Ϊkey�ĵ�i���ڵ�
     */
    BinaryNode<T> insertChild(BinaryNode<T> p, T t, int i);
    /**
     * ɾ��P�ڵ�ĵ�i������
     */
    void remove(BinaryNode<T> p, int i);
    /**
     * �����
     */
    void clear();
    /**
     * ��������Ϊkey�Ľ��
     */
    BinaryNode<T> search(T key);
    /**
     * �ж��Ƿ��������Ϊkey�Ľڵ�
     */
    boolean contains(T key);
    /**
     * ɾ������Ϊkey�Ľڵ�
     */
    T remove(T key);

}
