package pan.java.foundation.reflect.autoSetvalues;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.reflect.autoSetvalues
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  13:01
 * @Description:实现、调用setter方法和赋值
 * @Version: 1.0
 */
public class BeanUtils {
    private BeanUtils() {

    }

    public static void setValue(Object obj,String value){
        String[] strings = value.split("\\|");
        for (int i = 0; i < strings.length; i++) {
            String[] attval = strings[i].split(":");
            try {
//                获取第一个字符串为属性名
                Field declaredField = obj.getClass().getDeclaredField(attval[0]);
                Method declaredMethod = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(attval[0]), declaredField.getType());
//                调用方法,传入attval[1]参数值
                declaredMethod.invoke(obj, attval[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    设置数据类型
    public static void setValueWithType(Object obj,String value){
        String results[] = value.split("\\/");
        for (int i = 0; i < results.length; i++) {
            String[] params = results[i].split(":");
            try {
                Field filed = obj.getClass().getDeclaredField(params[0]);
                Method method = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(params[0]), filed.getType());
                Object coverValue = BeanUtils.coverAttributeValue(filed.getType().getName(),params[1]);
                method.invoke(obj,coverValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Object coverAttributeValue(String type, String param) {
        if("long".equals(type) || "java.lang.long".equals(type)){
            return Long.parseLong(param);
        }else if ("int".equals(type) || "java.lang.Integer".equals(type)){
            return Integer.parseInt(param);
        }else if("double".equals(type) || "java.langDouble".equals(type)){
            return Double.parseDouble(param);
        }else if ("java.util.Data".equals(type)){
            SimpleDateFormat sdf = null;
            if(param.matches("\\d{4}-\\d{2}-\\d{2}")){
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            }else if(param.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}-\\d{2}")){
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else {
                return new Date();
            }
            try {
                return sdf.parse(param);
            } catch (ParseException e) {
                return new Date();
            }
        }else{
            return param;
        }
    }


    //级联属性的赋值
    public static void setValues(Object obj,String value){
        String results[] = value.split("\\|");
        for(int i = 0;i < results.length; i++){
            String[] strings = results[i].split(":");
            try {
                if(strings[0].contains(".")){
                    String temp[] = strings[0].split("\\.");
                    Object currentObj = obj;
                    for(int j = 0;j < temp.length;j++){
                        Method method = currentObj.getClass().getDeclaredMethod("get" + StringUtils.initcap(temp[j]));
                        Object invoke = method.invoke(currentObj);
                        if(invoke == null){
                            Field field = currentObj.getClass().getDeclaredField(temp[j]);
                            Method declaredMethod = currentObj.getClass().getDeclaredMethod("set" + StringUtils.initcap(temp[j]), field.getType());
                            Object newInstance = field.getType().getDeclaredConstructor().newInstance();
                            method.invoke(currentObj,newInstance);
                            currentObj = newInstance;
                        }
                    }
                }else{
                    Field declaredField = obj.getClass().getDeclaredField(strings[0]);
                    Method declaredMethod = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(strings[0]), declaredField.getType());
                    Object value1 = BeanUtils.coverAttributeValue(declaredField.getType().getName(), strings[1]);
                    declaredMethod.invoke(obj,value1);
                }
            }catch (Exception e) {

            }
        }
    }
}
