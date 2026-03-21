package 课外作业.菜品介绍;

/**
 * ClassName: Dish
 * Package: 课外作业.菜品介绍
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:38
 * @Version: v1.0
 *
 */
public class Dish {
    //属性
    private String dishName;
    private double price;
    private String taste;
    //构造方法

    public Dish() {
    }

    public Dish(String dishName, double price, String taste) {
        this.dishName = dishName;
        this.price = price;
        this.taste = taste;
    }
    //set/get方法

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    //行为
    public void dishIntroduction(){
        System.out.println("菜品介绍");
    }
}
