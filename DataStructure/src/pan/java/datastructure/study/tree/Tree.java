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
     * 判断树是否为空
     */
    boolean isEmpty();
    /**
     * 返回key关键字所在的节点的层级
     */
    int level(T key);
    /**
     * 返回树的节点数
     */
    int size();
    /**
     * 返回树的高度
     */
    int height();
    /**
     * 输的先序遍历
     */
    void preorder();
    /**
     * 树的后续遍历
     */
    void postorder();
    /**
     * 输的层数遍历
     */
    void levelorder();
    /**
     * 插入树的跟根借点
     */
    BinaryNode<T> insertRoot(T x);
    /**
     * 插入p节点的数据为key的第i个节点
     */
    BinaryNode<T> insertChild(BinaryNode<T> p, T t, int i);
    /**
     * 删除P节点的第i棵子树
     */
    void remove(BinaryNode<T> p, int i);
    /**
     * 清空树
     */
    void clear();
    /**
     * 查找数据为key的借点
     */
    BinaryNode<T> search(T key);
    /**
     * 判断是否包含数据为key的节点
     */
    boolean contains(T key);
    /**
     * 删除数据为key的节点
     */
    T remove(T key);

}
