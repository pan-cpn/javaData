package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @CreateTime: 2023-05-19  05:34
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        SeqList<String> seqList = new SeqList<String>();
        seqList.insert("A");
        seqList.insert("B");
        seqList.insert("C");
        seqList.insert("D");
        seqList.insert("E");
        System.out.println(seqList.isEmpty());
        seqList.remove(1);
        String s = seqList.toString();
        System.out.println(s);
        System.out.println(seqList.size());
    }
}
