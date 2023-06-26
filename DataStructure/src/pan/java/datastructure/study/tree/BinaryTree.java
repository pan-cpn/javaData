package pan.java.datastructure.study.tree;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.tree
 * @Author: panYongSen
 * @CreateTime: 2023-06-09  09:46
 * @Description:二叉树类
 * @Version: 1.0
 */
public class BinaryTree <T>{
    public BinaryNode<T> root;
    public BinaryTree(){
        this.root = null;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public BinaryNode<T> insert(T x){
        return this.root = new BinaryNode<T>(x,this.root,null);
    }

    public BinaryNode<T> insert(BinaryNode<T> parent,T x,boolean leftChild){
        if(x == null){
            return null;
        }
        //判断插入的我是否是左边节点
        if(leftChild){
            return parent.left = new BinaryNode<T>(x, parent.left, null);
        }else {
            return parent.right = new BinaryNode<T>(x, null, parent.right);
        }
    }

    public void remove(BinaryNode<T> parent,boolean leftChild){
        if(leftChild){
            parent.left = null;
        }else{
            parent.right = null;
        }
    }

    public void clear(){
        this.root = null;
    }

    /**
     * 先序遍历
     */
    public void preorder(){
        preorder(this.root);
        System.out.println();
    }
    public void preorder(BinaryNode<T> p){
        if(p != null){
            System.out.println(p.data.toString()+" ");
            preorder(p.left);
            preorder(p.right);
        }
    }

    /**
     * 输出树的每一个节点
     */
    @Override
    public String toString(){
        return toString(this.root);
    }

    public String toString(BinaryNode<T> p){
        if(p == null){
            return "^";
        }else{
            return p.data.toString() + " "+toString(p.left) + toString(p.right);
        }
    }

    /**
     * 中序遍历，先输出根节点
     */
    public void inorder(){
        inorder(this.root);
        System.out.println();
    }
    public void inorder(BinaryNode<T> p){
        if(p != null){
            inorder(p.left);
            System.out.println(p.data.toString() + " ");
            inorder(p.right);
        }
    }

    /**
     * 后序遍历，
     */
    public void postorder(){
        postorder(this.root);
        System.out.println();
    }
    public void postorder(BinaryNode<T> p){
        if(p!= null){
            postorder(p.left);
            System.out.println(p.right);
            System.out.println(p.data.toString()+" ");
        }
    }
    
    /**
     * 返回树的节点数
     */
//    public int size(){
//
//    }
//    
//    /**
//     * 返回树的高度
//     */
//    public int height(){
//        
//    }

    public BinaryTree(T[] preList){
        this.root = create(preList);
    }

    private int i = 0;
    private BinaryNode<T> create(T[] preList){
        BinaryNode<T> p =null;
        if(i < preList.length){
            T elem = preList[i];
            i++;
            if(elem != null){
                p = new BinaryNode<T>(elem);
                p.left = create(preList);
                p.right = create(preList);
            }
        }
        return p;
    }


    public void printGenList(){
        System.out.println("输出二叉树的广义表：");
        printGenList(this.root);
        System.out.println();
    }
    public void  printGenList(BinaryNode<T> p){
        if(p == null){
            System.out.println("^");
        }else{
            System.out.println(p.data.toString()+" ");
            if(p.left != null || p.right != null){
                System.out.println("(");
                printGenList(p.left);
                System.out.println(",");
                printGenList(p.right);
                System.out.println(")");
            }
        }
    }


}
