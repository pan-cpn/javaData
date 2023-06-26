package pan.java.foundation.thread;

import java.util.concurrent.Callable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.thread
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  09:51
 * @Description:
 * @Version: 1.0
 */
public class FirstThread extends Thread{
    private String title;
    public FirstThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for(int i = 0;i < 10 ;i++){
            System.out.println(this.title + "运行,x = " + i);
        }
    }
}

class SecondThread implements Runnable {
    private String title;
    public SecondThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {

    }
}

class ThirdThread implements Callable{

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return "我可以有返回值";
    }
}