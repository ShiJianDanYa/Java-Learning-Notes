package 继承.课堂练习.方法重写.计算商品价格;

/**
 * ClassName: MobilePhone
 * Package: 继承.课堂练习.方法重写.计算商品价格
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 16:05
 * @Version: v1.0
 *
 */
public class MobilePhone extends IntelligentDevice{
    /*
    * 方法重写时注意
    * 1. 如果完全重写不会利用父类代码,只需要完全重写子类方法即可
    * 2. 如果是非完全重写,需要利用到父类中的方法只是在父类的基础
    * 上扩展,可以通过super得到父类方法结果,在对这个结果进行操作*/
    //行为 计算价格 优惠9折
    @Override
    public double calculatePrice() {
        //可以通过super调用父类里面的calculatePrice(),
        //计算出价格，再乘以0.9
        return super.calculatePrice()*0.9;
    }
}
