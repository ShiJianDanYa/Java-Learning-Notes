package 课外作业.菜品介绍;

/**
 * ClassName: ColdDishes
 * Package: 课外作业.菜品介绍
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:09
 * @Version: v1.0
 *
 */
public class ColdDishes extends Dish{
    private int shelfLife;
    public ColdDishes() {
    }
    public ColdDishes(String dishName, double price, String taste, int shelfLife) {
        super(dishName, price, taste);
        this.shelfLife = shelfLife;
    }
    //set/get

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
    //行为
    @Override
    public void dishIntroduction() {
        System.out.println("冷菜介绍："+getDishName()+"\n价格："+getPrice()+"\n口味："+getTaste()+"\n保质期："+shelfLife+"\n搭配火锅适合肠道速滑选手");
    }
}
