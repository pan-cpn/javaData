package pan.java.datastructure.study.LinkedList.list;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList.list
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  9:37
 * @Description:ˮ�Ӣ����
 * @Version: 1.0
 */
public class Hero {
    private int hno;
   /**
    * Ӣ�۵�����
    */
    private String name;
    /**
     * Ӣ�۵ı���
     */
    private String nickname;
    /**
     * ��һ��Ӣ��
     */
    public Hero next;

    public Hero(int hno, String name, String nickname) {
        this.hno = hno;
        this.name = name;
        this.nickname = nickname;
        this.next = null;
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hno=" + hno +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\''+"}";
    }
}
