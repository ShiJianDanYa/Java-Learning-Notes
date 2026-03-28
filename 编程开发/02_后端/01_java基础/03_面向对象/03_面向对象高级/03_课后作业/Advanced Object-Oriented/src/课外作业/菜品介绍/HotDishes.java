package 课外作业.菜品介绍;

/**
 * ClassName: HotDishes
 * Package: 课外作业.菜品介绍
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:56
 * @Version: v1.0
 *
 */
public class HotDishes extends Dish {
    //独有属性烹饪时间
    private int time;
    //构造方法
    public HotDishes() {

    }


    public HotDishes(String dishName, double price, String taste, int time) {
        super(dishName, price, taste);
        this.time = time;
    }
    //get和set方法
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    //行为
    @Override
    public void dishIntroduction() {
        System.out.println("菜品名称：" + getDishName() + "\n价格：" + getPrice() + " \n口味：" + getTaste() + "\n烹饪时间：" + time+"\n适合重口味食客");
    }
}
