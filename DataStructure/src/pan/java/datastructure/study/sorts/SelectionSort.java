package pan.java.datastructure.study.sorts;

import java.util.Arrays;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.sorts
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  10:23
 * @Description:ѡ������
 * @Version: 1.0
 */
public class SelectionSort {

    public static void selectSort(int[] array){
        //������Сֵ���±�
        int minIndex = 0;
//        ��������ĵ�һ����Ϊ��Сֵ
        int min = array[0];
        for(int j = 1;j < array.length; j++){
            if(min > array[j]){
//                ������Сֵ
                min = array[j];
//                ������Сֵ���±�
                minIndex = j;
            }
        }
//        ���������±��ֵ
        array[minIndex] = array[0];
        array[0] = min;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {55,33,88,66,11,99,20};
        selectSort(array);
    }

}
