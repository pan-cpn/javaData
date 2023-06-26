package pan.java.datastructure.study.recursion;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.recursion
 * @Author: panYongSen
 * @CreateTime: 2023-06-16  09:23
 * @Description:递归
 * @Version: 1.0
 */
public class Recursion {

    //设置迷宫的走位
    public void setStep(){}
    
    /**
     * 八皇后判断
     */
    public void qing(){}

    public static void main(String[] args) {
//        迷宫问题
        int[][] map = new int[8][7];
//        上下边为1表示墙
        for(int i = 0;i < 7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
//        左右边1表示墙
        for(int i = 0;i < 8;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        for(int i = 0; i < 8; i++){
            System.out.println();
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
    }
}
