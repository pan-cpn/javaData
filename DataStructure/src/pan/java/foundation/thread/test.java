package pan.java.foundation.thread;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.thread
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  11:16
 * @Description:
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        new FirstThread("A--").start();
        new FirstThread("B--").start();
        new FirstThread("C--").start();

        new Thread(new SecondThread("a---running!!")).start();
        new Thread(new SecondThread("b---running!!")).start();
        new Thread(new SecondThread("c---running!!")).start();
    }
}
