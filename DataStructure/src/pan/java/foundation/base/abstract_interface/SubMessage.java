package pan.java.foundation.base.abstract_interface;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.abstract_interface
 * @Author: panYongSen
 * @CreateTime: 2023-05-11  11:20
 * @Description:
 * @Version: 1.0
 */
public class SubMessage extends Message{
    //父类抽象类没有提供无参构造，子类必须实现带参构造，并且调用父类的构造方法
    public SubMessage(String type) {
        super(type);
    }

    @Override
    public void eat() {

    }

    @Override
    public String getConnectInfo() {
        return super.getType();
    }

    public static void main(String[] args) {
        //实例化抽象类
        Message msg = new SubMessage("Pandy");
        String info = msg.getConnectInfo();
        System.out.println(info);
        Message instance = Message.getInstance();
        String connectInfo = instance.getConnectInfo();
        System.out.println(connectInfo);
    }
}
