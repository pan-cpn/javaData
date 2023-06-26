package pan.java.foundation.base.innerClass;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  08:58
 * @Description:几种内部类
 * @Version: 1.0
 */
public class Outer1 {
}
interface InClass{
    void sendMessage(Imessage msg);
    interface Imessage{
        String getContent();
    }
}
class example1 implements InClass{

    @Override
    public void sendMessage(Imessage msg) {

    }
    class MeaasgeImpl implements Imessage{

        @Override
        public String getContent() {
            return null;
        }
    }
}

