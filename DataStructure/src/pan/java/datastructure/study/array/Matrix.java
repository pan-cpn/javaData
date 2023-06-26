package pan.java.datastructure.study.array;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.array
 * @Author: panYongSen
 * @CreateTime: 2023-06-01  08:59
 * @Description:æÿ’Û¿‡
 * @Version: 1.0
 */
public class Matrix {
    private int rows,columns;
    private int[][] element;
    public Matrix(int n,int m){
        this.element = new int[m][n];
        this.rows = n;
        this.columns = m;
    }
    public Matrix(int n){
        this(n,n);
    }
}
