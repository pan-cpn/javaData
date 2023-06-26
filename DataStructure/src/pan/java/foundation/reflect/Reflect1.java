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

    //自定义嘞加载器
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
//        实例化对象的三种操作
        //第一中，通过getClass()的方式
        Demo demo = new Demo();
        demo.getClass();

        //痛过类名.class获取
        Class<Demo> demoClass = Demo.class;
        //通过class类提供的forName方法获取
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

        //类加载器
        String s = "huiwehweuif";
        System.out.println(s.getClass().getClassLoader());
//        System.out.println(demo.getClass().getClassLoader().getResourceAsStream());
//        类加载器

    }
}
