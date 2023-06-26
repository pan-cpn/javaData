package pan.java.foundation.base.innerClass;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  08:25
 * @Description:lamdba表达式和方法 引用
 * @Version: 1.0
 */
public class LamdbaDemo {
    public static void main(String[] args) {
        Demo demo = (str) -> {
            System.out.println(str);
        };
        demo.print("Hello LiYingHe");

        IMath math = (a, b) -> {
            return a * b;
        };

        Function<Integer,String> fun = String::valueOf;
        String change = fun.change(1122);
        System.out.println(change.length());

        PFunction<String> fun1 = "ascdf"::toUpperCase;
        fun1.changea();
    }
}

//普通接口
interface Demo{
    void print(String msg);
}

@FunctionalInterface
interface IMath{
    int add(int a,int b);
}

@FunctionalInterface
interface Function<p,q>{
    q change(p p);
}

@FunctionalInterface
interface PFunction<P>{
    P changea();
}