package pan.java.datastructure.study.lineartable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.lineartable
 * @Author: panYongSen
 * @CreateTime: 2023-05-20  03:13
 * @Description:
 * @Version: 1.0
 */
public class StudentMangement {

    /**
     * ����ͳ�ƹ����ѧ���ɼ������ȼ���Ϣ
     */
    public static int[] groupCount(SeqList<Student> list,int[] grades){
        int[] result = new int[grades.length];
        for(int i = 0;i < grades.length; i++){
            int count = 0;
            int lowScore = grades[i];
            int highScore = grades[i + 1];
            for (int j = 0; j < list.size() - 1; j++) {
                Student student = list.get(j);
                if( student.getNode() >= lowScore && student.getNode() < highScore ){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    /**
     * ����ѧ��ͳ�ƽ��
     */
    public static void printCount(SeqList<Student> list,String[] titles,int[] results){

    }



}
