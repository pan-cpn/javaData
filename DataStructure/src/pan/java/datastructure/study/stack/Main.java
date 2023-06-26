package pan.java.datastructure.study.stack;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.stack
 * @Author: panYongSen
 * @CreateTime: 2023-05-24  16:45
 * @Description:
 * @Version: 1.0
 */
public class Main {

    //���Ĵ�
    public static String isMatched(String infix){
        SeqStack<String> seqStack = new SeqStack<>(infix.length());
        for(int i = 0;i < infix.length();i++){
            char c = infix.charAt(i);
            switch (c) {
                case '(':
                    seqStack.push(c + "");
                    break;
                    case ')':
                        if(seqStack.isEmpty() || !seqStack.pop().equals("(")) {
                            return "����(";
                        }
                        break;
            }
        }
        return (seqStack.isEmpty())?"��":"��";
    }


    //��׺���ʽת���ɺ�׺���ʽ
    public static StringBuffer toPostfix(String infix){

        return null;
    }




    public static void main(String[] args) {
        String a = "12((()))";
        System.out.println(isMatched(a));
    }
}
