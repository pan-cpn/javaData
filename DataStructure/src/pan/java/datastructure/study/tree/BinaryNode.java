package pan.java.datastructure.study.tree;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.tree
 * @Author: panYongSen
 * @CreateTime: 2023-06-09  09:39
 * @Description:TreeNode
 * @Version: 1.0
 */
public class BinaryNode<T> {
    public T data;
    public BinaryNode<T> left,right;
    public BinaryNode(T data,BinaryNode<T> left,BinaryNode<T> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(T data){
        this(data,null,null);
    }

    @Override
    public String toString(){
        return this.data.toString();
    }

    //判断是否是叶子节点
    public boolean isLeaf(){
        return this.left == null && this.right == null;
    }
}

