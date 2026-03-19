package 继承.课堂练习.方法重写.手机进化;

/**
 * ClassName: Test
 * Package: 继承.课堂练习.方法重写
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 15:06
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args) {
       /*
        在手机的发展历史中，第一代手机功能比较单一，只能用来打电话，
        比如在电视中经常见到的大哥大随着第二代数字移动通信系统（2G）的发展，
        手机体积逐渐变小，开始具备短信，彩信，基本功能进入到21世纪，主要是2009年左右，
        智能手机开始普及。按照这个背景设计手机的Javabean类
        第一代手机：
        功能：打电话
        第二代手机：
        功能：打电话，发短信
        第三代手机：
        功能：打电话升级为视频通话，发短信，玩游戏
        */
        //第一代手机
        FirstGeneration fg = new FirstGeneration();
        System.out.println("第一代手机");
        fg.call();
        //第二代手机
        SecondGeneration sg = new SecondGeneration();
        System.out.println("第二代手机");
        sg.call();
        sg.send();
        //第三代手机
        ThirdGeneration tg = new ThirdGeneration();
        System.out.println("第三代手机");
        tg.call();
        tg.send();
        tg.playGame();

    }
}
