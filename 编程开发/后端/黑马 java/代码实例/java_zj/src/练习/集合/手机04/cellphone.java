package 练习.集合.手机04;

/**
 * ClassName: cellphone
 * Package: 练习.集合.手机04
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1310:37
 * @Version1.0
 */
    
    /*
    需求如下
    定义Javabean类：Phone
    Phone属性：品牌，价格。
    main方法中定义一个集合，存入三个手机对象
    分别为：小米，1000。苹果，8000。锤子2999.
    定义一个方法，将价格低于3000的手机信息返回，
*/
public class cellphone {
    private String brand;
    private int price;
    public cellphone() {
    }
    public cellphone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
