package pan.java.foundation.reflect.autoSetvalues;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect.autoSetvalues
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  15:57
 * @Description:设置设置属性首字母大写，以此来找到对应属性
 * @Version: 1.0
 */
public class StringUtils {
    public static String initcap(String str){
        if(str == null || "".equals(str)){
            return str;
        }
        if(str.length() == 1){
            return str.toUpperCase();
        }else{
            return str.substring(0, 1).toUpperCase() + str.substring(1);

        }    }
}
