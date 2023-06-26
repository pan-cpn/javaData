package pan.java.foundation.classSetFramework;

import java.util.*;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.classSetFramework
 * @Author: panYongSen
 * @CreateTime: 2023-05-18  23:13
 * @Description:
 * @Version: 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        LinkedList<Number> numbers = new LinkedList<>();
        //处理高并发是应该使用的类，线程安全
        Vector<Integer> integers = new Vector<>();

        HashSet<String> hashSet = new HashSet<>();
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        strList.add("asd");
        strList.add("huyggy");
    }
}
