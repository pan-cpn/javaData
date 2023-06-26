package pan.java.foundation.base.abstract_interface;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.abstract_interface
 * @Author: panYongSen
 * @CreateTime: 2023-05-11  11:15
 * @Description:
 * @Version: 1.0
 */
public abstract class Message {
    public String type;
    public final String PORT= "112233445";
    //���󷽷�
    public abstract void eat();
    public abstract String getConnectInfo();

    public static  Message getInstance(){
        return new SubMessage("subType");
    }

//    public final abstract void getCon();  ���󣬳������в��ܶ���final����

//    public Message(){}  //�����޲ι��췽�� �����Ĭ�ϼ̳и�д�޲ι��췽��
    public Message(String type){   //�������ι��췽��������ͱ��븲д�˴��ι��췽��
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
