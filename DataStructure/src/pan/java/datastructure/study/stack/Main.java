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

    //回文串
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
                            return "期望(";
                        }
                        break;
            }
        }
        return (seqStack.isEmpty())?"对":"错";
    }


    //中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){

        return null;
    }




    public static void main(String[] args) {
        String a = "12((()))";
        System.out.println(isMatched(a));
    }
}
