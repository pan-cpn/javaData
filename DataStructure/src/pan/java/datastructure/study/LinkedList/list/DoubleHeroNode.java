package pan.java.datastructure.study.LinkedList.list;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList.list
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  09:25
 * @Description:
 * @Version: 1.0
 */
public class DoubleHeroNode {
    private int no;
    private String name;
    private DoubleHeroNode prev;
    private DoubleHeroNode next;
    public  DoubleHeroNode(int no,String name){
        this.name = name;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoubleHeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
