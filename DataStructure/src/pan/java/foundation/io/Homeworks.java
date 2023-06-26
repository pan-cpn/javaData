package pan.java.foundation.io;

import java.io.*;
import java.util.Scanner;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.io
 * @Author: panYongSen
 * @CreateTime: 2023-06-04  09:39
 * @Description:
 * @Version: 1.0
 */
public class Homeworks {

    public static int[] getIntNumber(){
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[3];
        boolean flag = true;
          for(int i = 0;i < 3;i++){
              System.out.println("请输入数字:");
              String s = scanner.nextLine();
              if(s.matches("\\d+")){
                  nums[i] = Integer.parseInt(s);
              }else{
                  System.out.println("你输入的不是数字");
                  i--;
              }
          }
        return nums;
    }

    /**
     * 比较三个键盘输入的数的大小
     */
    public static void max(){
        int[] ints = getIntNumber();
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] > max){
                max = ints[i];
            }
        }
        System.out.println(max);
    }

    /**
     * 保存数据到文件
     */
    public static void save(Object values){
        File file = new File("D:\\allProjects\\Code_Projects\\JavaProjects\\Java_Data\\DataStructure\\src\\pan\\java\\foundation\\io\\pan.txt");
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            byte[] bytes = values.toString().getBytes();
            out.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 实现字符串逆序输出达到文件中
     */
    public static void rebellious(String ...strs){

        File file = new File("D:\\allProjects\\Code_Projects\\JavaProjects\\Java_Data\\DataStructure\\src\\pan\\java\\foundation\\io\\pan.txt");
        if (!file.exists()) {
            file.mkdirs();
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for(int i = strs.length - 1;i >= 0; i--){
                fw.write(strs[i]);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 成绩排名：实现对键盘输入的一窜数字进行奇偶数判断，并且进行统计
     */
    public static void statistics(String numbers){}


    /**
     * 成绩排名：按照输入的TOM:89|JERRY:90|TONY:95格式的成绩进行排名，并且写入排名后的成绩单到文件中
     */
//    public static String classRank(String rankString){
//
//    }

    /**
     * 登陆验证
     */
    public static void login(String name,String password){}





    public static void main(String[] args) {
//        max();
//        save("dasfghasjkas");
        rebellious("a","b","c","d");

    }
}
