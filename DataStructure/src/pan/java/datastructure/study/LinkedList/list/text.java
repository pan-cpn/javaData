package pan.java.datastructure.study.LinkedList.list;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.datastructure.study.LinkedList.list
 * @Author: panYongSen
 * @CreateTime: 2023-06-15  17:50
 * @Description:������
 * @Version: 1.0
 */
public class text {
    public static void main(String[] args) {

        SingleHeroList singleHeroList = new SingleHeroList();
        singleHeroList.insertHero(1,"����","zhang");
        singleHeroList.insertHero(2,"����","li");
        singleHeroList.insertHero(3,"����","kui");
        singleHeroList.insertHero(4,"������","zhao");
        singleHeroList.insertHero(5,"����","liu");
        singleHeroList.updateHero(2,"xiaosi");
        String heroString = singleHeroList.outPutHeroString();
        System.out.println(heroString);
        SingleHeroList reverse = singleHeroList.reverse();
        System.out.println(reverse.outPutHeroString());
        System.out.println(singleHeroList.HeroCount());



    }
}
