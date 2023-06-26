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
              System.out.println("����������:");
              String s = scanner.nextLine();
              if(s.matches("\\d+")){
                  nums[i] = Integer.parseInt(s);
              }else{
                  System.out.println("������Ĳ�������");
                  i--;
              }
          }
        return nums;
    }

    /**
     * �Ƚ�����������������Ĵ�С
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
     * �������ݵ��ļ�
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
     * ʵ���ַ�����������ﵽ�ļ���
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
     * �ɼ�������ʵ�ֶԼ��������һ�����ֽ�����ż���жϣ����ҽ���ͳ��
     */
    public static void statistics(String numbers){}


    /**
     * �ɼ����������������TOM:89|JERRY:90|TONY:95��ʽ�ĳɼ���������������д��������ĳɼ������ļ���
     */
//    public static String classRank(String rankString){
//
//    }

    /**
     * ��½��֤
     */
    public static void login(String name,String password){}





    public static void main(String[] args) {
//        max();
//        save("dasfghasjkas");
        rebellious("a","b","c","d");

    }
}
