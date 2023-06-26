package pan.java.foundation.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  23:40
 * @Description:反射工厂设计模式
 * @Version: 1.0
 */
public class Reflect2 {
    public static void main(String[] args) {
        CloudMessage cloudMessage = Factory.getInstance("pan.java.foundation.reflect.CloudMessage", CloudMessage.class);
        cloudMessage.send();

        for(int i = 0;i < 3;i++){
            new Thread(()->{
                Singleton.getInstance().print();
            },"消费者："+i).start();
        }
    }
}
interface Message{
    void send();
}
class CloudMessage implements Message{
    @Override
    public void send() {
        System.out.println("输出云服务");
    }
}

class NetworkMessage implements Message {

    @Override
    public void send() {
        System.out.println("输出网络");
    }
}

class Factory{
    private Factory() {

    }
    public static <T> T getInstance(String className,Class<T> clazz){
        T instance = null;
        try {
            instance = (T)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  instance;
    }
}

class Singleton{
    private static Singleton instance = null;
    private Singleton(){
        System.out.println(Thread.currentThread().getName());
    }
    public static Singleton getInstance(){
        if(instance == null){
//            同步代码块,同步锁，防止多线程产生的线程不同步
            synchronized (Singleton.class){
             if(instance == null){
                 instance = new Singleton();
             }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("panpanpanpan");
    }
}