package 专题综合练习.面向对象.案例02对象数组.对象数组练习02;

/**
 * ClassName: Automobile
 * Package: 专题综合练习.面向对象.案例02对象数组.对象数组练习02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/811:08
 * @Version1.0
 * 
 */
    
    /*
    定义数组存储3部汽车对象。
    汽车的属性：品牌，价格，颜色。
    创建三个汽车对象，数据通过键盘录入而来，
    并把数据存入到数组当中。
*/
public class Automobile {
    //品牌
     private String brand;
     //价格
     private int price;
     //颜色
     private String color;
     // 无参构造
     public Automobile() {
     }

     //全参构造
     public Automobile(String brand, int price, String color) {
         this.brand = brand;
         this.price = price;
         this.color = color;
     }
     // getter setter

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
