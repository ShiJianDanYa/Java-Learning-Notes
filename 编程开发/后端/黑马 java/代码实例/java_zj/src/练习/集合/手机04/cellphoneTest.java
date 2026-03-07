package 练习.集合.手机04;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * ClassName: cellphoneTest
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
public class cellphoneTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<cellphone> list = new ArrayList<cellphone>();
        //创建对象
        cellphone p1 = new cellphone("小米",1000);
        cellphone p2 = new cellphone("苹果",8000);
        cellphone p3 = new cellphone("锤子",2999);
        //添加对象
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //方法
        ArrayList<cellphone> jg =filtrate(list);
        //遍历集合
        for (int i = 0; i <jg.size() ; i++) {
            cellphone p = jg.get(i);
            System.out.println(p.getBrand()+"---"+p.getPrice());
        }

        System.out.println("程序结束");
    }
    public static ArrayList<cellphone> filtrate(ArrayList<cellphone> list){
        //获取价格
        ArrayList<cellphone>  arr = new ArrayList<cellphone>();

        for (int i = 0; i < list.size(); i++) {
            cellphone p = list.get(i);
            //技巧：
            //如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
            //集合 数组
            //定义集合 返回需要数据
            if(p.getPrice()<3000){
//                System.out.println(p.getBrand()+"---"+p.getPrice());
                //添加到手机对象
                arr.add(p);
            }
        }
        return arr;
    }
}
