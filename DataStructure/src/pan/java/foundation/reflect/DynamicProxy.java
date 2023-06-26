package pan.java.foundation.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  07:00
 * @Description:
 * @Version: 1.0
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnData = null;
        if(this.connect()){
            returnData = method.invoke(this.target,args);
            this.close();
        }
        return returnData;
    }

    public Object bind(Object obj){
        this.target = obj;
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    public boolean connect(){
        System.out.println("消息代理，消息通道发送消息成功！！");
        return true;
    }
    public void close(){
        System.out.println("消息通道关闭，停止发送！！");
    }
}
interface IMessage{
    void send();
}
class MessageImpl implements IMessage {

    @Override
    public void send() {
        System.out.println("信息发送着呀！！！！");
    }
}
