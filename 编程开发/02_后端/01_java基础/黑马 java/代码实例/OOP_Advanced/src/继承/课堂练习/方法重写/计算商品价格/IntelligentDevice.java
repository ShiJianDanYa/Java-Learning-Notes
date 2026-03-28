package 继承.课堂练习.方法重写.计算商品价格;

/**
 * ClassName: IntelligentDevice
 * Package: 继承.课堂练习.方法重写.计算商品价格
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 16:04
 * @Version: v1.0
 *
 */
public class IntelligentDevice {
    String name;
    double price;

    //行为计算价格
    public double calculatePrice(){
        if(price<0){
            System.out.println("价格不能小于0");
            return -1;
        }
        else if(price>=0&&price<=1000){
            return price;
        }else if (price<=5000){
            return price*0.9;
        }else if(price<=10000){
            return price*0.8;
        }else{
            return price*0.7;
        }
        }
    }
