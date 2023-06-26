package pan.java.datastructure.study.string;

import java.io.Serializable;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.string
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  07:25
 * @Description:
 * @Version: 1.0
 */
public final class MyStringBuffer implements Serializable {
    private char[] value;
    private int n;
    public MyStringBuffer(int capacity){
        this.value = new char[capacity];
        this.n = 0;
    }
    public MyStringBuffer(){   //����Ĭ�������մ�
        this(16);
    }

    public MyStringBuffer(String str){  //�Ը������ַ��������µĴ�
        this(str.length() + 16);
        this.n = str.length();
        for(int i = 0; i< this.n;i++){
            this.value[i] = str.charAt(i);
        }
    }
    public int length(){
        //�����ַ����ĳ���
        return this.n;
    }

    public int capacity(){
        //�����ַ����������
        return this.value.length;
    }

    @Override
    public synchronized String toString(){
        return new String(this.value,0,this.n);
    }

    public synchronized MyStringBuffer insert(int index,String str){
        if(this.n == 0 && index == 0 || this.n > 0 && index >= 0 && index <= this.n){
            if(str == null){
                str = "null";
            }
            //��ԭ�������ݱ�����һ����ʱ������
            char[] temp = this.value;
            //�жϵ�ǰ�ַ�����Ķ������Ƿ��ܹ����µ�ǰ�ַ�����ĳ��ȼ�����Ҫ������ַ����ĳ���
            if(this.value.length < this.n + str.length()){
                //����������Ҫ��������
                this.value = new char[(this.value.length) + str.length() * 2];
                for(int i = 0; i< index;i++){
                    this.value[i] = temp[i];
                }
            }
            for(int j = this.n-1; j >= index; j--){
                this.value[j + str.length()] = temp[j];
            }
            for(int j = 0;j < str.length(); j++){
                this.value[index + j] = str.charAt(j);
            }
            this.n += str.length();
            return this;
        }else{
            throw new StringIndexOutOfBoundsException("index is out of bounds");
        }
    }

    public synchronized MyStringBuffer delete(int begin,int end){
        if(begin >= 0 && begin < this.n && end >= 0 && begin <= end){
            if(end > this.n){
                end = this.n;
            }
            for(int i = 0;i < this.n - end;i++){
                this.value[begin + i] = this.value[end + i];
            }
            this.n = end - begin;
            return this;
        }else{
            throw new StringIndexOutOfBoundsException("begin and end are out  of bounds!!");
        }
    }

//  public synchronized char charAt(int index){}  //�Ż�ָ���±���ַ�
//  public void setChatSet(int index,char cha){}  //�޸�ĳ���ַ���
//  public synchronized MyStringBuffer insert(int index,String str){} //�����Ӵ�
//    public synchronized MyStringBuffer delete(int begin, int end){}  //ɾ��ָ��������Ӵ�

}
