package pan.java.datastructure.study.sorts;

import java.util.Arrays;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.sorts
 * @Author: panYongSen
 * @CreateTime: 2023-06-16  10:12
 * @Description:ð������
 * @Version: 1.0
 */
public class BubbleSorting {
    public static void bubbleSort(int[] array){
        int temp = 0;
        //�Ż�����
        //��־�Ƿ��Ѿ�������
        boolean flag = false;
        for(int i = 0;i < array.length - 1; i++){
            //����4��
            for(int j = 0;j < array.length - 1 -i; j++){
                if(array[j] > array[j + 1]){
                    flag = true;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
            if(flag == false){
                break;
            }else {
                flag = false;
            }
            System.out.println(Arrays.toString(array));
        }
//        for(int i = 0;i < array.length - 2; i++){
//            //����ڶ���
//                if(array[i] > array[i + 1]){
//                    temp = array[i];
//                    array[i] = array[i+1];
//                    array[i+ 1] = temp;
//                }
//        }
//        for(int i = 0;i < array.length - 3; i++){
//            //���������
//            if(array[i] > array[i + 1]){
//                temp = array[i];
//                array[i] = array[i+1];
//                array[i+ 1] = temp;
//            }
//        }
//        for(int i = 0;i < array.length - 4; i++){
//            //������Ĵ�
//            if(array[i] > array[i + 1]){
//                temp = array[i];
//                array[i] = array[i+1];
//                array[i+ 1] = temp;git
//            }
//        }
    }
    public static void main(String[] args) {
        int[] array = {2,4,6,3,4,1,7,0,23};
        int[] array1 = {2,4,6,3,4};
        bubbleSort(array1);
        bubbleSort(array);

    }
}
