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
        Object anInt = new Int(112);  //װ��
        int x = ((Int) anInt).intValue();   //����

//        ʹ�����췽������װ�����
//        Double(doubleValue);
//          Integer(intValue);
//        Boolean(booleanValue);
//        �Զ�������Զ�װ��

//        ��������ת��:
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
