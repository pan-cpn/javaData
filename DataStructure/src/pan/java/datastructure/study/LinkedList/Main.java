package pan.java.datastructure.study.LinkedList;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList
 * @Author: panYongSen
 * @CreateTime: 2023-05-21  07:39
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");
        list.insert("E");
        list.insert("F");
        String s = list.toString();
//        System.out.println(s);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(2));
//        System.out.println(list.contains("C"));
//        System.out.println(list.insert(2,"b"));
//        System.out.println(list.toString());
//        System.out.println(list.contains("b"));
//        System.out.println(list.remove(1));
        System.out.println(s);
        System.out.println(list.remove("B"));
        System.out.println(list.toString());
        System.out.println(list.insertDifferent("C"));
        System.out.println(list.insertDifferent("k"));
        list.set(1,"e");
        System.out.println(list.toString());

    }
}
