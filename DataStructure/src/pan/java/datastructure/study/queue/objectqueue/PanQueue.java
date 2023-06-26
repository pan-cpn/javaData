package pan.java.datastructure.study.queue.objectqueue;
/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  10:20
 * @Description:队列，先进先出
 * @Version: 1.0
 */
public interface PanQueue<T> {
     boolean isEmpty();
     /**
      * 入队列
      */
     boolean add(T data);
     /**
      * 返回队列的头部元素，不出队列
      */
     T peek();
     /**
      * 出队列，并返回队列头部元素
      */
     T poll();

}
