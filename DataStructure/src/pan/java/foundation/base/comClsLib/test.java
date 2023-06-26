package pan.java.foundation.base.comClsLib;

import java.util.Arrays;
import java.util.UUID;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.comClsLib
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  13:09
 * @Description:
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {

//        Runtime类的一些基本方法
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        runtime.gc();

//        System的一些系统基本方法
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {7,8,9,0,11};
        System.gc();
        System.currentTimeMillis();
        System.arraycopy(num1,1,num2,3,2);
        System.out.println(Arrays.stream(num2).sum());

//        UUID五重复数
        UUID u = UUID.randomUUID();
        System.out.println(u);


    }
}
