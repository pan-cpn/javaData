package pan.java.foundation.base.enums;

public enum Color {
    BLACK("��ɫ"){
        @Override
        public String getMessage() {
            return "��";
        }
    },RED("��ɫ"){
        @Override
        public String getMessage() {
            return "��";
        }
    },WHITE("��ɫ"){
        @Override
        public String getMessage() {
            return "��";
        }
    };
    private String title;
    
    /**
     * ö���и��������ĳ��º��ѹ�������ÿһ��ö�ٶ��󶼱���ʵ��
     */
    public abstract String getMessage();
    private Color(String name){
        this.title = name;
    }

    @Override
    public String toString(){
        return this.title;
    }
}
