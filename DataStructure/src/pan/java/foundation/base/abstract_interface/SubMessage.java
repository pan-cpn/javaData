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
    //���������û���ṩ�޲ι��죬�������ʵ�ִ��ι��죬���ҵ��ø���Ĺ��췽��
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
        //ʵ����������
        Message msg = new SubMessage("Pandy");
        String info = msg.getConnectInfo();
        System.out.println(info);
        Message instance = Message.getInstance();
        String connectInfo = instance.getConnectInfo();
        System.out.println(connectInfo);
    }
}
