package pan.java.foundation.reflect;

import sun.misc.Unsafe;

import java.lang.reflect.*;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  14:25
 * @Description:
 * @Version: 1.0
 */
public class Demo extends C implements A,B{
    private String name;
    private String message;
    public Demo(String name,String message){
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Demo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> demoClass = Demo.class;
//        获取的是当前所在的包
        Package aPackage = demoClass.getPackage();
        System.out.println(aPackage.getName());
//        获取的是所有的父类
        Class<?> superclass = demoClass.getSuperclass();
        System.out.println(superclass.getName());
        System.out.println(superclass.getSuperclass().getName());
//        获取的是所有的接口
        Class<?>[] interfaces = demoClass.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i].getName());
        }
//        获取全构造方法
        Constructor<?>[] declaredConstructors = demoClass.getDeclaredConstructors();
        for (Constructor<?> cons:declaredConstructors
             ) {
            System.out.println(cons);
        }
//        获取但参数的构造方法
        Constructor<?> declaredConstructor = demoClass.getDeclaredConstructor(String.class, String.class);
        Object nihao1 = declaredConstructor.newInstance("nihao1","biiywewee");
        System.out.println(nihao1);

//        通过方式获取方法信息
        Method[] methods = demoClass.getMethods();
        for (Method m: methods) {
//            获取方法的权限修师傅
            int modifiers = m.getModifiers();
            System.out.println(Modifier.toString(modifiers)+",");
            System.out.println(m.getReturnType().getName()+",");
            System.out.println(m.getName()+",");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.println(parameterTypes[i].getName()+",");
            }
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if(exceptionTypes.length > 0){
                System.out.println("throws");
            }
            for (int i = 0; i < exceptionTypes.length; i++) {
                System.out.println(exceptionTypes[i].getName());
}
            System.out.println();

//            获取共有属性
            Field[] fields = demoClass.getFields();
            for (int i = 0; i < fields.length;i++){
                System.out.println(fields[i].getName());
//                解除封装
                fields[i].setAccessible(true);
            }
//            获取类的实力属性
            Field[] declaredFields = demoClass.getDeclaredFields();
            for (Field declaredField:declaredFields
                 ) {
                System.out.println(declaredField.getName());
            }

//            通过Unsafe类直接获取实例化对象
            Field filed = Unsafe.class.getDeclaredField("aaa");
            filed.setAccessible(true);
        }
    }

    @Override
    public void play() {
        System.out.println("play play play play");
    }

    @Override
    public void eat() {
        System.out.println("eat eat eat");
    }
}
interface A{
    void play();
}
interface B{
    void eat();
}
abstract class C{

}
