package pan.java.foundation.base.innerClass;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  07:48
 * @Description:
 * @Version: 1.0
 */
public class Outer {
    private String msg = "�����ⲿ���˽������";
    public void printInfo(){
        Inner in = new Inner();
        System.out.println(in.info);
        in.printMsg();
    }
    class Inner{
        private String info = "�����ڲ����˽������";
        private void printMsg(){
            System.out.println(Outer.this.msg);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.printInfo();
    }
}
