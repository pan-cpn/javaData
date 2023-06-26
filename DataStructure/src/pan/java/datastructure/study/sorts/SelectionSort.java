package pan.java.datastructure.study.sorts;

import java.util.Arrays;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.sorts
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  10:23
 * @Description:选择排序
 * @Version: 1.0
 */
public class SelectionSort {

    public static void selectSort(int[] array){
        //设置最小值的下标
        int minIndex = 0;
//        设置数组的第一个数为最小值
        int min = array[0];
        for(int j = 1;j < array.length; j++){
            if(min > array[j]){
//                更新最小值
                min = array[j];
//                更新最小值的下标
                minIndex = j;
            }
        }
//        交换两个下标的值
        array[minIndex] = array[0];
        array[0] = min;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {55,33,88,66,11,99,20};
        selectSort(array);
    }

}
