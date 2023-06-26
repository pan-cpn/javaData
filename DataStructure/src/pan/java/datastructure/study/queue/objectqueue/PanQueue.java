package pan.java.datastructure.study.queue.objectqueue;
/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.queue
 * @Author: panYongSen
 * @CreateTime: 2023-05-26  10:20
 * @Description:���У��Ƚ��ȳ�
 * @Version: 1.0
 */
public interface PanQueue<T> {
     boolean isEmpty();
     /**
      * �����
      */
     boolean add(T data);
     /**
      * ���ض��е�ͷ��Ԫ�أ���������
      */
     T peek();
     /**
      * �����У������ض���ͷ��Ԫ��
      */
     T poll();

}
