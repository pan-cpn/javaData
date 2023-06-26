package pan.java.foundation.reflect.autoSetvalues;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect.autoSetvalues
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  12:55
 * @Description:定义工具类实现紫东赋值
 * @Version: 1.0
 */
public class ClassInstanceFactory {
    public static <T> T create(Class<?> clazz,String value){
        try {
            Object o = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(o,value);
            return (T)o;
        } catch (Exception e) {
            return null;
        }
    }
}
