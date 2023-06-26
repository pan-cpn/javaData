package pan.java.foundation.reflect;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  08:18
 * @Description:
 * @Version: 1.0
 */
public class StaticProxy {
}
interface Eat{
    void get();
}
class EatReal implements Eat{
    @Override
    public void get() {
        System.out.println("�õ���");
    }
}
class EatProxy implements Eat {
    private Eat eat;
    public EatProxy(Eat eat){
        this.eat = eat;
    }
    @Override
    public void get(){
        this.prepare();
        this.eat.get();
        this.clear();
    }

    public void prepare(){
        System.out.println("1,��");
        System.out.println("2,����");
    }

    public void clear(){
        System.out.println("3,����");
    }

}
