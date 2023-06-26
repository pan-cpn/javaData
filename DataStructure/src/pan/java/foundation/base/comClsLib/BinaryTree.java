package pan.java.foundation.base.comClsLib;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.comClsLib
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  13:40
 * @Description:
 * @Version: 1.0
 */
public class BinaryTree <T extends Comparable<T>>{   //子类也必须实现对应的comparable接口
    private class Node{
        private Comparable<T> data;
        private Node parent;
        private Node left;
        private Node right;
        public Node(Comparable<T> data){
            this.data = data;
        }
    }
}
