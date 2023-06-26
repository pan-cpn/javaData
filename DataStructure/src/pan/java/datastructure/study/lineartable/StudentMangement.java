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
     * 返回统计过后的学生成绩分数等级信息
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
     * 返回学生统计结果
     */
    public static void printCount(SeqList<Student> list,String[] titles,int[] results){

    }



}
