package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @Description:���־�����
 * @Version: 1.0
 */
public class Josephs {
    public Josephs(int number,int start,int distance){
        System.out.println("Josephus"+start+","+number + ","+distance);
        SeqList<String> list = new SeqList<String>();
        for(int i = 0;i < number;i++){
            list.insert((char)('A'+i)+"");
        }
        System.out.println(list.toString());
        int i = start;
        while(list.size() > 1){
            i = (i + distance -1)%list.size();
            System.out.println("ɾ��"+list.remove(i).toString()+",");
            System.out.println(list.toString());
        }
        System.out.println("���ʤ�������ǣ�"+list.get(0).toString());
    }
    public static  void  main(String[] args) {
        new Josephs(10,0,2);
    }
}
