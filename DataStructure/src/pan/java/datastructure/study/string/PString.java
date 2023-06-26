package pan.java.datastructure.study.string;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.string
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  10:54
 * @Description:串的接口
 * @Version: 1.0
 */
public interface PString {
//    串是由一连串的字符著称的有限序列
//        串的每一个字符都通过下标取得
//    字串:字串表示有原先串中的一部分字符组成的字符
    /**
     * 串的本身是它自身的字串，串中的第一个字符下标为0，下标为-1表示不在串中。
     * 空串是任意字符串的字串，字串的序号表示其再串的首字母的下标位置
     * 串的比较是：串的比较是根据字母的编码值所决定，大小写字符串字母的比较也不一样
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

