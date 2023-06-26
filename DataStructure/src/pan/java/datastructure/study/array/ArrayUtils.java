package pan.java.datastructure.study.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.array
 * @Author: panYongSen
 * @CreateTime: 2023-06-14  8:04
 * @Description:普通数组转稀疏数组，稀疏数组转普通数组，并且·1能够·输出到文件中保存
 * @Version: 1.0
 */
public class ArrayUtils {
    public static int[][] array = new int[11][11];
    public static String FILE_PATH = "D:\\allProjects\\Code_Projects\\JavaProjects\\Java_Data\\DataStructure\\src\\pan\\java\\datastructure\\study\\array";
    public static int[][] normalToSparse(int[][]  normalArray){
        int row = normalArray.length;
        int column = normalArray[0].length;
        int valuesCount = 1;
        for (int i = 0;i < normalArray.length; i++){
            for (int j = 0; j < normalArray[i].length; j++) {
                if(normalArray[i][j] != 0){
                    valuesCount++;
                }
            }
        }
        int[][] sparseArray = new int[valuesCount][3];
        int index = 0;
        sparseArray[0][0] = row;
        sparseArray[0][1] = column;
        sparseArray[0][2] = valuesCount - 1;
        for(int i = 0;i < normalArray.length;i++){
            for(int j = 0; j< normalArray[i].length; j++){
                if(normalArray[i][j] != 0){
                    index = index + 1;
                    sparseArray[index][0] = i;
                    sparseArray[index][1] = j;
                    sparseArray[index][2] = normalArray[i][j];
                }
            }
        }
        return sparseArray;
    }

    public static int[][] sparseToNormal(int[][] sparseArray){
        int[][] normalArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            normalArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for(int i = 0;i < normalArray.length; i++){
            System.out.println();
            for(int j = 0;j < normalArray[i].length;j++){
                System.out.print(normalArray[i][j] + " ");
            }
        }
        return normalArray;
    }

    public static void outPut(int[][] array){
       FileOutputStream out = null;
        try {
             out = new FileOutputStream(new File(FILE_PATH,"array.txt"),true);
             byte[] buf = new byte[1024];
            for (int i = 0; i < array.length; i++) {
                out.write('\n');
                for (int j = 0; j < array[i].length; j++) {
                    out.write(String.valueOf(array[i][j]).getBytes());
                    out.write(' ');
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
        array[0][1] = 3;
        array[1][1] = 4;
        array[0][3] = 1;
        array[2][2] = 5;
        array[0][2] = 8;
        array[1][2] = 9;
        array[2][3] = 54;
        outPut(array);
        int[][] sparse = normalToSparse(array);
        outPut(sparse);
        System.out.println(sparseToNormal(sparse));

    }
}
