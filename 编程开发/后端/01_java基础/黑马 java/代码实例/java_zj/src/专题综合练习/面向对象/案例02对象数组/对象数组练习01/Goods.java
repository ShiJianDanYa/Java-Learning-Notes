package 专题综合练习.面向对象.案例02对象数组.对象数组练习01;

/**
 * ClassName: Goods
 * Package: 专题综合练习.面向对象.案例02对象数组
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/810:38
 * @Version1.0
 */
    
    /*
    定义数组存储3个商品对象。
    商品的属性：商品的id，名字，价格，库存。
    创建三个商品对象，并把商品对象存入到数组当中
*/
public class Goods {
    private int id;
    private String name;
    private double price;
    private int stock;

    //空参构造
    public Goods() {
    }
    //全参构造
    public Goods(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //getter和setter

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
