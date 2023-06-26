package pan.java.foundation.reflect;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  13:21
 * @Description:
 * @Version: 1.0
 */
public class Reflect1 {
    private static final String FILE_PATH = "d:"+ File.separator + "Message.class";

    //�Զ����ϼ�����
//    public Class<?> loadData(String className) throws Exception{
//        byte[] data = this.loadDataClass();
//        if(data != null){
//            return super.defineClass(className,data,0,data.length);
//        }
//        return null;
//    }

    private byte[] loadDataClass() throws IOException {
        InputStream in = null;
        ByteArrayOutputStream bou = null;
        byte[] data = null;
        try{
            int len = 0;
            byte[] data1 = new byte[1024];
            in = new FileInputStream(new File(FILE_PATH));
            bou = new ByteArrayOutputStream(in.read(data1));
            data = bou.toByteArray();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                in.close();
            }
            if(bou != null){
                bou.close();
            }
        }
        return  data;
    }

    public static void main(String[] args) {
//        ʵ������������ֲ���
        //��һ�У�ͨ��getClass()�ķ�ʽ
        Demo demo = new Demo();
        demo.getClass();

        //ʹ������.class��ȡ
        Class<Demo> demoClass = Demo.class;
        //ͨ��class���ṩ��forName������ȡ
        try {
            Class<?> aClass = Class.forName("pan.java.foundation.reflect.Demo");
            Demo o =  (Demo)aClass.getDeclaredConstructor().newInstance();
            o.setName("pan");
            o.setMessage("asfghdkl");
            String toString = o.toString();
            System.out.println(toString);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //�������
        String s = "huiwehweuif";
        System.out.println(s.getClass().getClassLoader());
//        System.out.println(demo.getClass().getClassLoader().getResourceAsStream());
//        �������

    }
}
