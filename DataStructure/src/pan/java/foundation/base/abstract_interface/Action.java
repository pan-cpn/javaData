package pan.java.foundation.base.abstract_interface;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.abstract_interface
 * @Author: panYongSen
 * @CreateTime: 2023-05-12  00:21
 * @Description:抽象类的板块设计
 * @Version: 1.0
 */
public abstract class Action {
    public static final int EAT = 1;
    public static final int SLEEP = 2;
    public static final int WORK = 3;
    public void command(int code){
        switch (code) {
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + SLEEP + WORK:
                this.eat();
                this.sleep();
                this.work();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
