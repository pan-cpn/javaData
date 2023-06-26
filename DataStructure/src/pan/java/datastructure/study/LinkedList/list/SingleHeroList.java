package pan.java.datastructure.study.LinkedList.list;

import java.util.Stack;


/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList.list
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  17:42
 * @Description:
 * @Version: 1.0
 */
public class SingleHeroList {
    private Hero head;

    public SingleHeroList() {
        this.head = new Hero(0,"","");
    }
    
    /**
     * 根据英雄数组创建英雄链表
     */
    public SingleHeroList(Hero heros[]){
        Hero hero = this.head;
        for(int i = 0;i < heros.length; i++){
            hero.next = new Hero(heros[i].getHno(),heros[i].getName(),heros[i].getNickname());
            hero = hero.next;
        }
    }
    
    /**
     * 添加一个英雄
     */
    public void insertHero(int no,String name,String neckName) {
        if (no < 1 || no > 108 || name == "" || neckName == "") {
            return;
        }
        if (this.isEmpty()) {
            this.head.next = new Hero(no, name, neckName);
            return;
        }
        if(this.search(no) != null){
            return;
        }
        Hero hero = this.head.next;
        while (true) {
            if (hero.next == null) {
                break;
            }
            hero = hero.next;
        }
        hero.next = new Hero(no, name, neckName);

    }

    private boolean isEmpty() {
        return this.head.next == null;
    }

    /**
     * 杀死最后一个英雄
     */
    public void removeHero(){
        if(this.isEmpty()){
            return;
        }
        Hero hero = this.head;
        Hero current = hero.next;
        while(true){
            if(current.next == null){
                break;
            }
            hero = hero.next;
            current = current.next;
        }
        hero.next = null;

    }
    
    /**
     * 修改一个英雄
     */
    public void updateHero(int no,String neckName){
        Hero hero = this.search(no);
        hero.setNickname(neckName);
    }

    /**
     * 根据英雄的编号查找英雄的信息
     */
    public Hero search(int no){
        if(no > 108 || no < 1){
            return null;
        }
        if(this.isEmpty()){
            return null;
        }
        Hero hero = this.head.next;
        Hero targetHero = null;
        while(true){
            if(hero.getHno() == no){
                targetHero = hero;
               break;
            }
            if(hero.next != null) {
                hero = hero.next;
            }else{
                break;
            }
        }

        return targetHero;
    }

    /**
     * 输出所有英雄
     */
    public String outPutHeroString(){
        String heros = "";
        if (this.isEmpty()) {
            return "没有英雄";
        }
        Hero hero = this.head.next;
        while(true){
            if(hero != null){
                heros += hero.toString() + "\n";
                hero = hero.next;
            }else {
                break;
            }
        }
        return heros;
    }

    public int HeroCount(){
        if(this.isEmpty()){
            return 0;
        }
        int count = 0;
        Hero hero = this.head;
        while (true) {
            if(hero.next == null){
                break;
            }
            hero = hero.next;
            count++;
        }
        return count;
    }

    public SingleHeroList reverse(){
        Stack<Hero> stack = new Stack<Hero>();
        if(this.isEmpty()){
            return null;
        }
        Hero hero = this.head;
        while(true){
            if(hero.next == null){
                break;
            }
            hero = hero.next;
            stack.push(hero);
        }
        SingleHeroList s = new SingleHeroList();
        while(stack.size() > 0){
            Hero hero1 = stack.pop();
            s.insertHero(hero1.getHno(),hero1.getName(),hero1.getNickname());
       }
       return s;
    }


}
