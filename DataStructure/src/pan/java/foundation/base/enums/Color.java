package pan.java.foundation.base.enums;

public enum Color {
    BLACK("黑色"){
        @Override
        public String getMessage() {
            return "黑";
        }
    },RED("红色"){
        @Override
        public String getMessage() {
            return "红";
        }
    },WHITE("白色"){
        @Override
        public String getMessage() {
            return "白";
        }
    };
    private String title;
    
    /**
     * 枚举中给出公共的抽下很难过方法，每一个枚举对象都必须实现
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
