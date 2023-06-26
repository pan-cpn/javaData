package pan.java.datastructure.study.string;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.string
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  08:31
 * @Description:
 * @Version: 1.0
 */
public class MyInteger implements Comparable<MyInteger>{
    public static final int MIN_VALUE = 0x80000000;
    public static final int MAX_VALUE = 0x7fffffff;
    public final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return this.value + "";
    }

    public MyInteger(String str){
        this.value = MyInteger.parseInt(str);
    }

    private static int parseInt(String str) {
        return MyInteger.parseInt(str,10);
    }

    //按照指定进指数转换字符串为数字类型
    public static int parseInt(String s,int radix){
        if(s == null){
            throw new NumberFormatException("x == null");
        }
        if(radix < 2 || radix > 16){
            throw new NumberFormatException("给定的进指数超出了规定的进指数范围");
        }
        int value = 0,i = 0;
        //设置出符号位
        int sign = s.charAt(0) == '-' ? -1 : 1;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            //跳过检测符号位
            if(s.length() == 1){
                throw new NumberFormatException("s");
            }else{
                i++;
            }
        }
        while(i < s.length()){
            char cha = s.charAt(i++);
            if(cha >= '0' && cha-'0'<radix){
                value = value * radix + cha - '0';
            }else{
                if(radix > 10 && radix <= 16 && cha >= 'a' && cha - 'a' < radix - 10){
                    value = value * radix +cha - 'a' + 10;
                }else{
                    if(radix > 10 && radix <= 16 && cha >= 'A' && cha-'a' < radix - 10){
                        value = value * radix + cha - 'A' + 10;
                    }
                    else {
                        throw new NumberFormatException("radix:"+radix +"cha" +cha);
                    }
                }
            }
        }
        return value * sign;
    }

    public static String toHexString(int value){
        char[] buffer = new char[8];
        for(int i = buffer.length - 1;i >= 0;i--){
            int bit = value & 15;
            buffer[i] = (char)(bit <= 9? bit + '0':bit + 'a' -10);
            value >>>= 4;
        }
        return new String(buffer);
    }


    @Override
    public boolean equals(Object obj){
        return obj instanceof Integer && this.value == ((Integer)obj).intValue();
    }

    @Override
    public int compareTo(MyInteger o) {
        return this.value < o.value ? -1 : (this.value == o.value ? 0: 1);
    }


    /**
     * 转二进制
     */
//    public static String toBinaryString(int value){
//
//    }
//
//    /**
//     * 转十进制
//     */
//    public static String toOctalString(int value) {
//
//    }
//
//    /**
//     * 转二到十六进制
//     */
//    public static String toString(int value,int radix){
//
//    }
}
