package pan.java.datastructure.study.array;

/**
*@BelongsProject: Java_Data
*@BelongsPackage: pan.java.datastructure.study.array
*@Author: panYongSen
*@CreateTime: 2023-05-31  04:15
*@Description: 
*@Version: 1.0
*/
public class Array_one {
    public static void main(String[] args) {
        /**
         * 二维数组的声明的两种方式
         */
        int[][] arr = new int[66][44];
        int[][] arr1 = {{},{}};
        //返回二维数组的行数
        System.out.println(arr.length);
//        返回二维数组的列数
        System.out.println(arr[0].length);

        int[][] arr2 = new int[2][];
        System.out.println();
    }
}
