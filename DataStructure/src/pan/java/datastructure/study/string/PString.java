package pan.java.datastructure.study.string;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.string
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  10:54
 * @Description:���Ľӿ�
 * @Version: 1.0
 */
public interface PString {
//    ������һ�������ַ����Ƶ���������
//        ����ÿһ���ַ���ͨ���±�ȡ��
//    �ִ�:�ִ���ʾ��ԭ�ȴ��е�һ�����ַ���ɵ��ַ�
    /**
     * ���ı�������������ִ������еĵ�һ���ַ��±�Ϊ0���±�Ϊ-1��ʾ���ڴ��С�
     * �մ��������ַ������ִ����ִ�����ű�ʾ���ٴ�������ĸ���±�λ��
     * ���ıȽ��ǣ����ıȽ��Ǹ�����ĸ�ı���ֵ����������Сд�ַ�����ĸ�ıȽ�Ҳ��һ��
     */
    int length();
    char charAt(int index);
    void setCharAt(int index,char cha);
    PString substring(int begin,int end);
    PString concat(PString string);
    PString insert(int index,PString str);
    PString delete(int begin,int end);
    @Override
    boolean equals(Object obj);
    int compareTo(PString pstr);
    int indexOf(PString pattern);
    void removeAll(PString pattern);
    void replaceAll(PString pattern,PString str);
}

