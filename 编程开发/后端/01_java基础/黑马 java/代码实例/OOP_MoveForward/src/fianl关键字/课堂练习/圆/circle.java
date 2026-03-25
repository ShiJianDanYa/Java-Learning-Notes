package fianl关键字.课堂练习.圆;

/**
 * ClassName: circle
 * Package: fianl关键字.课堂练习.圆
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 22:14
 * @Version: v1.0
   */
public class circle {
    /*定义一个Javabean类描圆
    属性：
    半径和圆周率
    行为：
    计算圆的面积和周长
    */
    //定义半径和圆周率
    private double radius;
    private final double Pi = 3.1415;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //定义方法求面积
    public  double area(){
        return (radius*radius)*Pi;
    }
    //周长
    public  double perimeter(){
        return 2*radius*Pi;
    }
}
