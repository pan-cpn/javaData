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
    //抽象方法
    public abstract void eat();
    public abstract String getConnectInfo();

    public static  Message getInstance(){
        return new SubMessage("subType");
    }

//    public final abstract void getCon();  错误，抽象类中不能定义final方法

//    public Message(){}  //给定无参构造方法 子类就默认继承覆写无参构造方法
    public Message(String type){   //给定带参构造方法，子类就必须覆写此带参构造方法
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
