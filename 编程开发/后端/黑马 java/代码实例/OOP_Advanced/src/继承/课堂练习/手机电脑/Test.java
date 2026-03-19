package 继承.课堂练习.手机电脑;

/**
 * ClassName: Text
 * Package: 继承.课堂练习.手机电脑
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 12:38
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        /*
        现在有三个电子设备，请设计他们的继承结构安卓手机：
        属性：品牌，价格，
        行为：打电话，发短信，nfc功能苹果手机：
        属性：品牌，价格行为：打电话，发短信
        笔记本电脑：
        属性：品牌，价格行为：编程

        画图：从下往上
        与代码：从上往下
        */

        //电脑对象
        Computer c = new Computer();
        c.name = "戴尔";
        c.price = 5000;
        //输出
        System.out.println(c.name+" "+c.price);
        c.programme();
        //安卓
        Android a = new Android();
        a.name = "小米";
        a.price = 4000;
        //输出
        System.out.println(a.name+" "+a.price);
        a.call();
        a.sendMessage();
        a.nfc();

        //苹果
        Apple i = new Apple();
        i.name = "苹果";
        i.price = 8000;
        System.out.println(i.name+" "+i.price);
        i.call();
        i.sendMessage();
    }
}
