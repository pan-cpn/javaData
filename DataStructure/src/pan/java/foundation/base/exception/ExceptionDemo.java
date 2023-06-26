package pan.java.foundation.base.exception;
/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.exception
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  07:19
 * @Description:
 * @Version: 1.0
 */
public class ExceptionDemo {
    public static void main(String[] args){
        Integer num = new Integer(1123);
        if(num > 1000){
            try {
                throw  new MyException("´íi");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
