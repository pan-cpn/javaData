package pan.java.datastructure.study.string;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.string
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  10:48
 * @Description:
 * @Version: 1.0
 */
public class MyString implements Comparable<MyString>,java.io.Serializable{
    private final char[] values;
    public MyString(){
        this.values = new char[0];
    }
    /**
     * 由原始串构建串
     */
    public MyString(java.lang.String str){
        this.values = new char[str.length()];
        for(int i= 0;i < this.values.length; i++){
            this.values[i] = str.charAt(i);
        }
    }

    public MyString(char[] value,int index,int n){
        if(index >= 0 && n >= 0 && index + n <= value.length){
            this.values = new char[n];
            for(int i = 0;i < n;i++){
                this.values[i] = value[index + i];
            }
        }else{
            throw new StringIndexOutOfBoundsException("i and n out of index");
        }
    }

    public MyString(char[] value){
        this(value,0, value.length);
    }


    public MyString(MyString str){
        this(str.values);
    }

    public String totString(){
        return new String(this.values);
    }



    @Override
    public int compareTo(MyString o) {
        for(int index = 0;index < this.values.length && index < o.values.length; index++){
            if(this.values[index] != o.values[index]){
                return this.values[index] - o.values[index];
            }
        }
        return this.values.length - o.values.length;
    }


    public int length() {
        return this.values.length;
    }


    public char charAt(int index) {
        if(index >= 0 && index < this.values.length){
            return this.values[index];
        }
        throw new StringIndexOutOfBoundsException("index is out of ");
    }


    public void setCharAt(int index, char cha) {

    }


    public MyString substring(int begin, int end) {
        //截取子串
        if(begin == 0 && end  == this.values.length){
            return this;
        }
        return new MyString(this.values,begin,end);
    }

    public MyString concat(MyString string) {
        if(string == null){
            string = new MyString("null");
        }
        char[] buffer = new char[this.values.length + string.length()];
        int index;
        for(index = 0; index < this.values.length;index++){
            buffer[index] = this.values[index];
        }
        for(int i = 0;i < string.values.length; i++){
            buffer[index + i] = string.values[i];
        }
        return new MyString(buffer);
    }


    public MyString insert(int index, MyString str) {
        return null;
    }


    public MyString delete(int begin, int end) {
        return null;
    }




    public int indexOf(MyString pattern) {
        return 0;
    }

    public void removeAll(MyString pattern) {

    }


    public void replaceAll(MyString pattern, MyString str) {

    }

//    public MyString trim(){}
}
