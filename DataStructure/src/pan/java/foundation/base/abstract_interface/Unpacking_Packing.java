package pan.java.foundation.base.abstract_interface;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base
 * @Author: panYongSen
 * @CreateTime: 2023-05-11  11:31
 * @Description:
 * @Version: 1.0
 */
public class Unpacking_Packing {
    public static void main(String[] args) {
        Object anInt = new Int(112);  //装箱
        int x = ((Int) anInt).intValue();   //拆箱

//        痛过构造方法进行装箱操作
//        Double(doubleValue);
//          Integer(intValue);
//        Boolean(booleanValue);
//        自动拆箱和自动装箱

//        数据类型转换:
//        Integer: parseInt(String s);
//        Double: parseDouble(String s);
//        Boolean parseBoolean(String s);
    }
}
class Int{
    private int data;
    public Int(int data){
        this.data = data;
    }
    public int intValue(){
        return this.data;
    }
}
