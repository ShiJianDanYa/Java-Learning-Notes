package 课外作业.电商;

/**
 * ClassName: Commodity
 * Package: 课外作业.电商
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:25
 * @Version: v1.0
 *
 */
public class Commodity {
    //商品属性
    private String name;
    private double price;
    //构造方法

    public Commodity() {
    }

    public Commodity(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //get和set方法

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //行为
    public void showlnfo(){
        System.out.println("商品名称："+name+" 商品价格："+price);
    }
}
